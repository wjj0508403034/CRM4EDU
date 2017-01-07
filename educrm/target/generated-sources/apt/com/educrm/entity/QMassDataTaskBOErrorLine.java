package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMassDataTaskBOErrorLine is a Querydsl query type for MassDataTaskBOErrorLine
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMassDataTaskBOErrorLine extends EntityPathBase<MassDataTaskBOErrorLine> {

    private static final long serialVersionUID = -276955782L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMassDataTaskBOErrorLine massDataTaskBOErrorLine = new QMassDataTaskBOErrorLine("massDataTaskBOErrorLine");

    public final NumberPath<Integer> blockBeginRow = createNumber("blockBeginRow", Integer.class);

    public final NumberPath<Integer> blockEndRow = createNumber("blockEndRow", Integer.class);

    public final StringPath errCode = createString("errCode");

    public final StringPath errMsg = createString("errMsg");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMassDataTask massDataTask;

    public final StringPath rowData = createString("rowData");

    public final NumberPath<Integer> rowNum = createNumber("rowNum", Integer.class);

    public final StringPath sheetName = createString("sheetName");

    public QMassDataTaskBOErrorLine(String variable) {
        this(MassDataTaskBOErrorLine.class, forVariable(variable), INITS);
    }

    public QMassDataTaskBOErrorLine(Path<? extends MassDataTaskBOErrorLine> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMassDataTaskBOErrorLine(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMassDataTaskBOErrorLine(PathMetadata<?> metadata, PathInits inits) {
        this(MassDataTaskBOErrorLine.class, metadata, inits);
    }

    public QMassDataTaskBOErrorLine(Class<? extends MassDataTaskBOErrorLine> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.massDataTask = inits.isInitialized("massDataTask") ? new QMassDataTask(forProperty("massDataTask")) : null;
    }

}

