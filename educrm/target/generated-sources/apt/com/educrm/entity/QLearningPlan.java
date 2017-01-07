package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QLearningPlan is a Querydsl query type for LearningPlan
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLearningPlan extends EntityPathBase<LearningPlan> {

    private static final long serialVersionUID = -692508743L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLearningPlan learningPlan = new QLearningPlan("learningPlan");

    public final StringPath code = createString("code");

    public final NumberPath<Integer> duration = createNumber("duration", Integer.class);

    public final DateTimePath<java.util.Date> endDate = createDateTime("endDate", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> maxQty = createNumber("maxQty", Integer.class);

    public final NumberPath<Integer> minQty = createNumber("minQty", Integer.class);

    public final StringPath name = createString("name");

    public final QProductBundle productBundle;

    public final DateTimePath<java.util.Date> startDate = createDateTime("startDate", java.util.Date.class);

    public final EnumPath<com.educrm.enumeration.LearningPlanStatus> status = createEnum("status", com.educrm.enumeration.LearningPlanStatus.class);

    public QLearningPlan(String variable) {
        this(LearningPlan.class, forVariable(variable), INITS);
    }

    public QLearningPlan(Path<? extends LearningPlan> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLearningPlan(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLearningPlan(PathMetadata<?> metadata, PathInits inits) {
        this(LearningPlan.class, metadata, inits);
    }

    public QLearningPlan(Class<? extends LearningPlan> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productBundle = inits.isInitialized("productBundle") ? new QProductBundle(forProperty("productBundle"), inits.get("productBundle")) : null;
    }

}

