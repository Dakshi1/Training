package com.ps.dao;

public final class DaoFactory {

	private static String discriminator = "csv";

	public static ProductDao getProductDao(String discriminator) throws DaoException {
		DaoFactory.discriminator = discriminator;
		return getProductDao();
	}

	public static ProductDao getProductDao() throws DaoException {
		switch (discriminator) {
		case "jdbc":
			return new ArrayListProductDao();
			//return new CsvProductDao();
		case "dummy":
			//return new DummyProductDao();
		case "jdc":
			throw new DaoException("No implementation for jdbc yet");
		case "hibernate":
			throw new DaoException("No implementation for hibernate yet");
		default:
			throw new DaoException("Unknown type for discriminator: " + discriminator);
		}
	}

}
