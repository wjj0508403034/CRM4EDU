package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QClassRoom is a Querydsl query type for ClassRoom
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QClassRoom extends EntityPathBase<ClassRoom> {

    private static final long serialVersionUID = 1978949473L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QClassRoom classRoom = new QClassRoom("classRoom");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath address = createString("address");

    public final StringPath code = createString("code");

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final StringPath description = createString("description");

    public final QDistrict district;

    public final BooleanPath hasProjector = createBoolean("hasProjector");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Integer> maxQty = createNumber("maxQty", Integer.class);

    public final NumberPath<Integer> minQty = createNumber("minQty", Integer.class);

    public final StringPath name = createString("name");

    public final EnumPath<com.educrm.enumeration.ClassRoomTypeEnum> roomType = createEnum("roomType", com.educrm.enumeration.ClassRoomTypeEnum.class);

    public final ListPath<Schedule, QSchedule> schedules = this.<Schedule, QSchedule>createList("schedules", Schedule.class, QSchedule.class, PathInits.DIRECT2);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QClassRoom(String variable) {
        this(ClassRoom.class, forVariable(variable), INITS);
    }

    public QClassRoom(Path<? extends ClassRoom> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QClassRoom(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QClassRoom(PathMetadata<?> metadata, PathInits inits) {
        this(ClassRoom.class, metadata, inits);
    }

    public QClassRoom(Class<? extends ClassRoom> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.district = inits.isInitialized("district") ? new QDistrict(forProperty("district")) : null;
    }

}

