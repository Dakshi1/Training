import React, {Component} from 'react';

export class DetailCard extends Component
{
    render()
    {
        return (
            <div className="card" style={{width: '250px', float: 'left'}}>
                <img src={data.picture} className="card-img-top" alt={data.firstname} />
                    <div className="card-body">
                        <h5 className="card-title">{data.firstname} {data.lastname}</h5>
                        <p>{data.email}</p>
                        <p>{data.phone}</p>
                    </div>
            </div>  
                );
    }
}