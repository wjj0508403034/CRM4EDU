package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QRolePermission is a Querydsl query type for RolePermission
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QRolePermission extends EntityPathBase<RolePermission> {

    private static final long serialVersionUID = -2068500809L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRolePermission rolePermission = new QRolePermission("rolePermission");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final QPermission permission;

    public final QRole role;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QRolePermission(String variable) {
        this(RolePermission.class, forVariable(variable), INITS);
    }

    public QRolePermission(Path<? extends RolePermission> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QRolePermission(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QRolePermission(PathMetadata<?> metadata, PathInits inits) {
        this(RolePermission.class, metadata, inits);
    }

    public QRolePermission(Class<? extends RolePermission> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.permission = inits.isInitialized("permission") ? new QPermission(forProperty("permission")) : null;
        this.role = inits.isInitialized("role") ? new QRole(forProperty("role")) : null;
    }

}

