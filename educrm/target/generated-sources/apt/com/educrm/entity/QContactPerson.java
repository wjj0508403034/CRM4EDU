package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QContactPerson is a Querydsl query type for ContactPerson
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QContactPerson extends EntityPathBase<ContactPerson> {

    private static final long serialVersionUID = -2088687229L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QContactPerson contactPerson = new QContactPerson("contactPerson");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final DatePath<org.joda.time.LocalDate> birthday = createDate("birthday", org.joda.time.LocalDate.class);

    public final QCity city;

    public final StringPath code = createString("code");

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final ListPath<CustomerContact, QCustomerContact> customerContacts = this.<CustomerContact, QCustomerContact>createList("customerContacts", CustomerContact.class, QCustomerContact.class, PathInits.DIRECT2);

    public final StringPath emailAddress = createString("emailAddress");

    public final EnumPath<com.educrm.enumeration.GenderEnum> gender = createEnum("gender", com.educrm.enumeration.GenderEnum.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath language = createString("language");

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath mobile1 = createString("mobile1");

    public final StringPath mobile2 = createString("mobile2");

    public final StringPath name = createString("name");

    public final StringPath phone1 = createString("phone1");

    public final StringPath phone2 = createString("phone2");

    public final StringPath position = createString("position");

    public final StringPath qqNumber = createString("qqNumber");

    public final StringPath reportManager = createString("reportManager");

    public final QState state;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public final StringPath weChatNumber = createString("weChatNumber");

    public QContactPerson(String variable) {
        this(ContactPerson.class, forVariable(variable), INITS);
    }

    public QContactPerson(Path<? extends ContactPerson> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QContactPerson(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QContactPerson(PathMetadata<?> metadata, PathInits inits) {
        this(ContactPerson.class, metadata, inits);
    }

    public QContactPerson(Class<? extends ContactPerson> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.city = inits.isInitialized("city") ? new QCity(forProperty("city"), inits.get("city")) : null;
        this.state = inits.isInitialized("state") ? new QState(forProperty("state")) : null;
    }

}

