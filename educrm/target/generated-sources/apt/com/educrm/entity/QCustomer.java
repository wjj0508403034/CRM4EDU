package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCustomer is a Querydsl query type for Customer
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCustomer extends EntityPathBase<Customer> {

    private static final long serialVersionUID = -299504336L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomer customer = new QCustomer("customer");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final BooleanPath active = createBoolean("active");

    public final StringPath address = createString("address");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final DateTimePath<org.joda.time.DateTime> birthday = createDateTime("birthday", org.joda.time.DateTime.class);

    public final QCity city;

    public final StringPath code = createString("code");

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final ListPath<CustomerContact, QCustomerContact> customerContacts = this.<CustomerContact, QCustomerContact>createList("customerContacts", CustomerContact.class, QCustomerContact.class, PathInits.DIRECT2);

    public final EnumPath<com.educrm.enumeration.CustomerStageEnum> customerStage = createEnum("customerStage", com.educrm.enumeration.CustomerStageEnum.class);

    public final EnumPath<com.educrm.enumeration.CustomerTypeEnum> customerType = createEnum("customerType", com.educrm.enumeration.CustomerTypeEnum.class);

    public final StringPath description = createString("description");

    public final StringPath emailAddress = createString("emailAddress");

    public final EnumPath<com.educrm.enumeration.GenderEnum> gender = createEnum("gender", com.educrm.enumeration.GenderEnum.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QIndustry industry;

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath mobile1 = createString("mobile1");

    public final StringPath mobile2 = createString("mobile2");

    public final StringPath name = createString("name");

    public final StringPath parentCompany = createString("parentCompany");

    public final StringPath phone1 = createString("phone1");

    public final StringPath phone2 = createString("phone2");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final StringPath qqNumber = createString("qqNumber");

    public final StringPath siteURL = createString("siteURL");

    public final QStaff staff;

    public final QState state;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public final StringPath weChatNumber = createString("weChatNumber");

    public QCustomer(String variable) {
        this(Customer.class, forVariable(variable), INITS);
    }

    public QCustomer(Path<? extends Customer> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomer(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomer(PathMetadata<?> metadata, PathInits inits) {
        this(Customer.class, metadata, inits);
    }

    public QCustomer(Class<? extends Customer> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.city = inits.isInitialized("city") ? new QCity(forProperty("city"), inits.get("city")) : null;
        this.industry = inits.isInitialized("industry") ? new QIndustry(forProperty("industry")) : null;
        this.staff = inits.isInitialized("staff") ? new QStaff(forProperty("staff"), inits.get("staff")) : null;
        this.state = inits.isInitialized("state") ? new QState(forProperty("state")) : null;
    }

}

