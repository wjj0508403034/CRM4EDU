package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTargetGroup is a Querydsl query type for TargetGroup
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTargetGroup extends EntityPathBase<TargetGroup> {

    private static final long serialVersionUID = 2073731292L;

    public static final QTargetGroup targetGroup = new QTargetGroup("targetGroup");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath code = createString("code");

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final StringPath description = createString("description");

    public final NumberPath<Integer> groupMemberNumber = createNumber("groupMemberNumber", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final ListPath<TargetGroupMember, QTargetGroupMember> members = this.<TargetGroupMember, QTargetGroupMember>createList("members", TargetGroupMember.class, QTargetGroupMember.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final EnumPath<com.educrm.enumeration.TargetGroupStatusEnum> status = createEnum("status", com.educrm.enumeration.TargetGroupStatusEnum.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QTargetGroup(String variable) {
        super(TargetGroup.class, forVariable(variable));
    }

    public QTargetGroup(Path<? extends TargetGroup> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTargetGroup(PathMetadata<?> metadata) {
        super(TargetGroup.class, metadata);
    }

}

