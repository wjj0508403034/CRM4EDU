package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QScheduleSeries is a Querydsl query type for ScheduleSeries
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QScheduleSeries extends EntityPathBase<ScheduleSeries> {

    private static final long serialVersionUID = 920819648L;

    public static final QScheduleSeries scheduleSeries = new QScheduleSeries("scheduleSeries");

    public final DateTimePath<java.util.Date> endTime = createDateTime("endTime", java.util.Date.class);

    public final StringPath frequency = createString("frequency");

    public final DateTimePath<java.util.Date> fromDate = createDateTime("fromDate", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.util.Date> startTime = createDateTime("startTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> toDate = createDateTime("toDate", java.util.Date.class);

    public QScheduleSeries(String variable) {
        super(ScheduleSeries.class, forVariable(variable));
    }

    public QScheduleSeries(Path<? extends ScheduleSeries> path) {
        super(path.getType(), path.getMetadata());
    }

    public QScheduleSeries(PathMetadata<?> metadata) {
        super(ScheduleSeries.class, metadata);
    }

}

