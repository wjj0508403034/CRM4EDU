package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCompetitor is a Querydsl query type for Competitor
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCompetitor extends EntityPathBase<Competitor> {

    private static final long serialVersionUID = 792257054L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCompetitor competitor = new QCompetitor("competitor");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath code = createString("code");

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final StringPath emailAddress = createString("emailAddress");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QIndustry industry;

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final StringPath parentCompany = createString("parentCompany");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final NumberPath<Long> scale = createNumber("scale", Long.class);

    public final StringPath siteURL = createString("siteURL");

    public final EnumPath<com.educrm.enumeration.CompetitorTypeEnum> type = createEnum("type", com.educrm.enumeration.CompetitorTypeEnum.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QCompetitor(String variable) {
        this(Competitor.class, forVariable(variable), INITS);
    }

    public QCompetitor(Path<? extends Competitor> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCompetitor(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCompetitor(PathMetadata<?> metadata, PathInits inits) {
        this(Competitor.class, metadata, inits);
    }

    public QCompetitor(Class<? extends Competitor> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.industry = inits.isInitialized("industry") ? new QIndustry(forProperty("industry")) : null;
    }

}

