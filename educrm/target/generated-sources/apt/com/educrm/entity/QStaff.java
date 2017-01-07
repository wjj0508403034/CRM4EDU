package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QStaff is a Querydsl query type for Staff
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QStaff extends EntityPathBase<Staff> {

    private static final long serialVersionUID = -47995186L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStaff staff = new QStaff("staff");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath address = createString("address");

    public final StringPath birthday = createString("birthday");

    public final EnumPath<com.educrm.enumeration.ClassName> className = createEnum("className", com.educrm.enumeration.ClassName.class);

    public final EnumPath<com.educrm.enumeration.ContractType> contractType = createEnum("contractType", com.educrm.enumeration.ContractType.class);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final EnumPath<com.educrm.enumeration.Department> department = createEnum("department", com.educrm.enumeration.Department.class);

    public final StringPath education = createString("education");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath indentityNo = createString("indentityNo");

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final EnumPath<com.educrm.enumeration.MaritalStatus> maritalStatus = createEnum("maritalStatus", com.educrm.enumeration.MaritalStatus.class);

    public final StringPath name = createString("name");

    public final StringPath nationality = createString("nationality");

    public final DateTimePath<java.util.Date> onBoardDate = createDateTime("onBoardDate", java.util.Date.class);

    public final StringPath organization = createString("organization");

    public final StringPath phone = createString("phone");

    public final EnumPath<com.educrm.enumeration.Position> position = createEnum("position", com.educrm.enumeration.Position.class);

    public final ListPath<Schedule, QSchedule> schedules = this.<Schedule, QSchedule>createList("schedules", Schedule.class, QSchedule.class, PathInits.DIRECT2);

    public final StringPath skill = createString("skill");

    public final ListPath<StaffDistrict, QStaffDistrict> staffDistricts = this.<StaffDistrict, QStaffDistrict>createList("staffDistricts", StaffDistrict.class, QStaffDistrict.class, PathInits.DIRECT2);

    public final StringPath staffNo = createString("staffNo");

    public final EnumPath<com.educrm.enumeration.StaffStatus> staffStatus = createEnum("staffStatus", com.educrm.enumeration.StaffStatus.class);

    public final EnumPath<com.educrm.enumeration.StaffType> staffType = createEnum("staffType", com.educrm.enumeration.StaffType.class);

    public final QStaff superior;

    public final NumberPath<Integer> totalWorkTime = createNumber("totalWorkTime", Integer.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public final StringPath zipcode = createString("zipcode");

    public QStaff(String variable) {
        this(Staff.class, forVariable(variable), INITS);
    }

    public QStaff(Path<? extends Staff> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QStaff(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QStaff(PathMetadata<?> metadata, PathInits inits) {
        this(Staff.class, metadata, inits);
    }

    public QStaff(Class<? extends Staff> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.superior = inits.isInitialized("superior") ? new QStaff(forProperty("superior"), inits.get("superior")) : null;
    }

}

