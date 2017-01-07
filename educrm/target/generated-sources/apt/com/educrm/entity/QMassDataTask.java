package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMassDataTask is a Querydsl query type for MassDataTask
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMassDataTask extends EntityPathBase<MassDataTask> {

    private static final long serialVersionUID = -1542627403L;

    public static final QMassDataTask massDataTask = new QMassDataTask("massDataTask");

    public final NumberPath<Long> attachmentId = createNumber("attachmentId", Long.class);

    public final BooleanPath attachmentRemoved = createBoolean("attachmentRemoved");

    public final NumberPath<Integer> currentRecords = createNumber("currentRecords", Integer.class);

    public final StringPath dataName = createString("dataName");

    public final StringPath dataType = createString("dataType");

    public final DateTimePath<org.joda.time.DateTime> endDate = createDateTime("endDate", org.joda.time.DateTime.class);

    public final StringPath errorNodeName = createString("errorNodeName");

    public final StringPath errorSheet = createString("errorSheet");

    public final NumberPath<Long> failureLogAttachmentId = createNumber("failureLogAttachmentId", Long.class);

    public final NumberPath<Long> failureRecordAttachmentId = createNumber("failureRecordAttachmentId", Long.class);

    public final NumberPath<Integer> failureRecords = createNumber("failureRecords", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<MassDataTaskBOErrorLine, QMassDataTaskBOErrorLine> massDataTaskBOErrorLines = this.<MassDataTaskBOErrorLine, QMassDataTaskBOErrorLine>createList("massDataTaskBOErrorLines", MassDataTaskBOErrorLine.class, QMassDataTaskBOErrorLine.class, PathInits.DIRECT2);

    public final StringPath message = createString("message");

    public final NumberPath<Integer> percentage = createNumber("percentage", Integer.class);

    public final NumberPath<Integer> skippedRecords = createNumber("skippedRecords", Integer.class);

    public final DateTimePath<org.joda.time.DateTime> startDate = createDateTime("startDate", org.joda.time.DateTime.class);

    public final NumberPath<Integer> succeedRecords = createNumber("succeedRecords", Integer.class);

    public final EnumPath<com.educrm.importexport.TaskStatus> taskStatus = createEnum("taskStatus", com.educrm.importexport.TaskStatus.class);

    public final EnumPath<com.educrm.importexport.TaskType> taskType = createEnum("taskType", com.educrm.importexport.TaskType.class);

    public final NumberPath<Integer> totalRecords = createNumber("totalRecords", Integer.class);

    public final DateTimePath<java.sql.Timestamp> updateDate = createDateTime("updateDate", java.sql.Timestamp.class);

    public final StringPath userCode = createString("userCode");

    public final StringPath UUID = createString("UUID");

    public final NumberPath<Integer> warningRecords = createNumber("warningRecords", Integer.class);

    public QMassDataTask(String variable) {
        super(MassDataTask.class, forVariable(variable));
    }

    public QMassDataTask(Path<? extends MassDataTask> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMassDataTask(PathMetadata<?> metadata) {
        super(MassDataTask.class, metadata);
    }

}

