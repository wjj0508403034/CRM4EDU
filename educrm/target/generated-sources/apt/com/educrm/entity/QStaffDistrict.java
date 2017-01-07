package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QStaffDistrict is a Querydsl query type for StaffDistrict
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QStaffDistrict extends EntityPathBase<StaffDistrict> {

    private static final long serialVersionUID = -297627524L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStaffDistrict staffDistrict = new QStaffDistrict("staffDistrict");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final QDistrict district;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final QStaff staff;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QStaffDistrict(String variable) {
        this(StaffDistrict.class, forVariable(variable), INITS);
    }

    public QStaffDistrict(Path<? extends StaffDistrict> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QStaffDistrict(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QStaffDistrict(PathMetadata<?> metadata, PathInits inits) {
        this(StaffDistrict.class, metadata, inits);
    }

    public QStaffDistrict(Class<? extends StaffDistrict> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.district = inits.isInitialized("district") ? new QDistrict(forProperty("district")) : null;
        this.staff = inits.isInitialized("staff") ? new QStaff(forProperty("staff"), inits.get("staff")) : null;
    }

}

