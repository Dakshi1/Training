package com.ps.dao;

public final class DaoFactory {

	private DaoFactory() {
	}

	public static ProductDao getProductDao(String discriminator) throws Exception {
		switch (discriminator.toLowerCase()) {
		case "arraylist":
			return new ArrayListProductDao();
		case "map":
			throw new DaoException("MapProductDao not avaialble yet");

		case "csv":
			return new CsvProductDao();
			//throw new DaoException("CsvProductDao not available yet");
		case "serialized":
			throw new DaoException("SerializedProductDao not avaialble yet");
		default:
			throw new DaoException("Invalid type for DAO implementation");
		}
	}
}
