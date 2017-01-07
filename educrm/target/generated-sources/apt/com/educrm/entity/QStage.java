package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QStage is a Querydsl query type for Stage
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QStage extends EntityPathBase<Stage> {

    private static final long serialVersionUID = -47995156L;

    public static final QStage stage = new QStage("stage");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final BooleanPath active = createBoolean("active");

    public final NumberPath<java.math.BigDecimal> closingPercentage = createNumber("closingPercentage", java.math.BigDecimal.class);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Integer> maximumDays = createNumber("maximumDays", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> optimalNumber = createNumber("optimalNumber", Integer.class);

    public final NumberPath<Integer> stageNo = createNumber("stageNo", Integer.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QStage(String variable) {
        super(Stage.class, forVariable(variable));
    }

    public QStage(Path<? extends Stage> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStage(PathMetadata<?> metadata) {
        super(Stage.class, metadata);
    }

}

