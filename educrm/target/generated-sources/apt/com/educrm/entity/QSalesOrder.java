package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QSalesOrder is a Querydsl query type for SalesOrder
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSalesOrder extends EntityPathBase<SalesOrder> {

    private static final long serialVersionUID = -1070958988L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSalesOrder salesOrder = new QSalesOrder("salesOrder");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath code = createString("code");

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final QCustomer customer;

    public final NumberPath<Integer> discountPercent = createNumber("discountPercent", Integer.class);

    public final StringPath externalOrderId = createString("externalOrderId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final ListPath<SalesOrderLine, QSalesOrderLine> lines = this.<SalesOrderLine, QSalesOrderLine>createList("lines", SalesOrderLine.class, QSalesOrderLine.class, PathInits.DIRECT2);

    public final StringPath remark = createString("remark");

    public final DatePath<org.joda.time.LocalDate> salesOrderDate = createDate("salesOrderDate", org.joda.time.LocalDate.class);

    public final QStaff salesPerson;

    public final NumberPath<Long> sourceId = createNumber("sourceId", Long.class);

    public final EnumPath<com.educrm.enumeration.SourceTypeEnum> sourceType = createEnum("sourceType", com.educrm.enumeration.SourceTypeEnum.class);

    public final NumberPath<java.math.BigDecimal> totalAmount = createNumber("totalAmount", java.math.BigDecimal.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QSalesOrder(String variable) {
        this(SalesOrder.class, forVariable(variable), INITS);
    }

    public QSalesOrder(Path<? extends SalesOrder> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSalesOrder(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSalesOrder(PathMetadata<?> metadata, PathInits inits) {
        this(SalesOrder.class, metadata, inits);
    }

    public QSalesOrder(Class<? extends SalesOrder> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.salesPerson = inits.isInitialized("salesPerson") ? new QStaff(forProperty("salesPerson"), inits.get("salesPerson")) : null;
    }

}

