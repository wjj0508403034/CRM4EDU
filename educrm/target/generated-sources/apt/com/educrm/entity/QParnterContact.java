package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QParnterContact is a Querydsl query type for ParnterContact
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QParnterContact extends EntityPathBase<ParnterContact> {

    private static final long serialVersionUID = -695694274L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QParnterContact parnterContact = new QParnterContact("parnterContact");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath address = createString("address");

    public final DatePath<org.joda.time.LocalDate> birthday = createDate("birthday", org.joda.time.LocalDate.class);

    public final QCity city;

    public final StringPath contactNo = createString("contactNo");

    public final QCountry country;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final QCustomer customer;

    public final StringPath email = createString("email");

    public final StringPath firstName = createString("firstName");

    public final EnumPath<com.educrm.enumeration.GenderEnum> gender = createEnum("gender", com.educrm.enumeration.GenderEnum.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QLanguage language;

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath lastName = createString("lastName");

    public final QStaff manager;

    public final StringPath organization = createString("organization");

    public final QStaff owner;

    public final StringPath phone = createString("phone");

    public final StringPath position = createString("position");

    public final StringPath QQ = createString("QQ");

    public final QState state;

    public final StringPath telephone = createString("telephone");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public final StringPath weixin = createString("weixin");

    public final StringPath zipcode = createString("zipcode");

    public QParnterContact(String variable) {
        this(ParnterContact.class, forVariable(variable), INITS);
    }

    public QParnterContact(Path<? extends ParnterContact> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QParnterContact(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QParnterContact(PathMetadata<?> metadata, PathInits inits) {
        this(ParnterContact.class, metadata, inits);
    }

    public QParnterContact(Class<? extends ParnterContact> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.city = inits.isInitialized("city") ? new QCity(forProperty("city"), inits.get("city")) : null;
        this.country = inits.isInitialized("country") ? new QCountry(forProperty("country")) : null;
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.language = inits.isInitialized("language") ? new QLanguage(forProperty("language")) : null;
        this.manager = inits.isInitialized("manager") ? new QStaff(forProperty("manager"), inits.get("manager")) : null;
        this.owner = inits.isInitialized("owner") ? new QStaff(forProperty("owner"), inits.get("owner")) : null;
        this.state = inits.isInitialized("state") ? new QState(forProperty("state")) : null;
    }

}

