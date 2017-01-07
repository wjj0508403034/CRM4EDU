package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCustomerContact is a Querydsl query type for CustomerContact
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCustomerContact extends EntityPathBase<CustomerContact> {

    private static final long serialVersionUID = 1525520592L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomerContact customerContact = new QCustomerContact("customerContact");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final QContactPerson contactPerson;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final QCustomer customer;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QCustomerContact(String variable) {
        this(CustomerContact.class, forVariable(variable), INITS);
    }

    public QCustomerContact(Path<? extends CustomerContact> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomerContact(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomerContact(PathMetadata<?> metadata, PathInits inits) {
        this(CustomerContact.class, metadata, inits);
    }

    public QCustomerContact(Class<? extends CustomerContact> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.contactPerson = inits.isInitialized("contactPerson") ? new QContactPerson(forProperty("contactPerson"), inits.get("contactPerson")) : null;
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
    }

}

