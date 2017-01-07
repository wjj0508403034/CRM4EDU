package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCustomerAddress is a Querydsl query type for CustomerAddress
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCustomerAddress extends EntityPathBase<CustomerAddress> {

    private static final long serialVersionUID = -573697884L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomerAddress customerAddress = new QCustomerAddress("customerAddress");

    public final QBaseAddress _super;

    // inherited
    public final QCity city;

    // inherited
    public final QCountry country;

    //inherited
    public final NumberPath<Long> createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate;

    // inherited
    public final QState state;

    //inherited
    public final StringPath street1;

    //inherited
    public final StringPath street2;

    //inherited
    public final NumberPath<Long> version;

    //inherited
    public final StringPath zipCode;

    public QCustomerAddress(String variable) {
        this(CustomerAddress.class, forVariable(variable), INITS);
    }

    public QCustomerAddress(Path<? extends CustomerAddress> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomerAddress(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomerAddress(PathMetadata<?> metadata, PathInits inits) {
        this(CustomerAddress.class, metadata, inits);
    }

    public QCustomerAddress(Class<? extends CustomerAddress> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseAddress(type, metadata, inits);
        this.city = _super.city;
        this.country = _super.country;
        this.createdBy = _super.createdBy;
        this.createdDate = _super.createdDate;
        this.lastModifiedBy = _super.lastModifiedBy;
        this.lastModifiedDate = _super.lastModifiedDate;
        this.state = _super.state;
        this.street1 = _super.street1;
        this.street2 = _super.street2;
        this.version = _super.version;
        this.zipCode = _super.zipCode;
    }

}

