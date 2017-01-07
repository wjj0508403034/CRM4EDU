package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QProductBundleItem is a Querydsl query type for ProductBundleItem
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProductBundleItem extends EntityPathBase<ProductBundleItem> {

    private static final long serialVersionUID = -380499982L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductBundleItem productBundleItem = new QProductBundleItem("productBundleItem");

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

    public final QProduct product;

    public final QProductBundle productBundle;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QProductBundleItem(String variable) {
        this(ProductBundleItem.class, forVariable(variable), INITS);
    }

    public QProductBundleItem(Path<? extends ProductBundleItem> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProductBundleItem(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProductBundleItem(PathMetadata<?> metadata, PathInits inits) {
        this(ProductBundleItem.class, metadata, inits);
    }

    public QProductBundleItem(Class<? extends ProductBundleItem> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product")) : null;
        this.productBundle = inits.isInitialized("productBundle") ? new QProductBundle(forProperty("productBundle"), inits.get("productBundle")) : null;
    }

}

