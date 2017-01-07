package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QSalesOrderLine is a Querydsl query type for SalesOrderLine
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSalesOrderLine extends EntityPathBase<SalesOrderLine> {

    private static final long serialVersionUID = 545669256L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSalesOrderLine salesOrderLine = new QSalesOrderLine("salesOrderLine");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final NumberPath<java.math.BigDecimal> calculatedPrice = createNumber("calculatedPrice", java.math.BigDecimal.class);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final NumberPath<Integer> discountPercentage = createNumber("discountPercentage", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Integer> lineNumber = createNumber("lineNumber", Integer.class);

    public final NumberPath<java.math.BigDecimal> lineTotal = createNumber("lineTotal", java.math.BigDecimal.class);

    public final QProductBundle productBundle;

    public final NumberPath<java.math.BigDecimal> quantity = createNumber("quantity", java.math.BigDecimal.class);

    public final QSalesOrder salesOrder;

    public final NumberPath<java.math.BigDecimal> totalPrice = createNumber("totalPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> unitPrice = createNumber("unitPrice", java.math.BigDecimal.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QSalesOrderLine(String variable) {
        this(SalesOrderLine.class, forVariable(variable), INITS);
    }

    public QSalesOrderLine(Path<? extends SalesOrderLine> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSalesOrderLine(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSalesOrderLine(PathMetadata<?> metadata, PathInits inits) {
        this(SalesOrderLine.class, metadata, inits);
    }

    public QSalesOrderLine(Class<? extends SalesOrderLine> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productBundle = inits.isInitialized("productBundle") ? new QProductBundle(forProperty("productBundle"), inits.get("productBundle")) : null;
        this.salesOrder = inits.isInitialized("salesOrder") ? new QSalesOrder(forProperty("salesOrder"), inits.get("salesOrder")) : null;
    }

}

