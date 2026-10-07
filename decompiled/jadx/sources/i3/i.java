package i3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends c2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5180c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, int i10, int i11) {
        super(i, i10);
        this.f5180c = i11;
    }

    @Override // c2.a
    public final void a(h2.b bVar) {
        switch (this.f5180c) {
            case 0:
                jc.i.e(bVar, "db");
                bVar.i("CREATE TABLE IF NOT EXISTS `notifications` (`notificationId` TEXT NOT NULL, `title` TEXT NOT NULL, `body` TEXT NOT NULL, `url` TEXT, `receivedAt` INTEGER NOT NULL, `read` INTEGER NOT NULL, PRIMARY KEY(`notificationId`))");
                break;
            case 1:
                jc.i.e(bVar, "db");
                bVar.i("CREATE TABLE IF NOT EXISTS `checker_batches` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `gate` TEXT NOT NULL, `content` TEXT NOT NULL, `total` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL)");
                break;
            case 2:
                jc.i.e(bVar, "db");
                bVar.i("CREATE TABLE IF NOT EXISTS `temp_mail_history` (`email` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`email`))");
                break;
            case 3:
                jc.i.e(bVar, "db");
                bVar.i("CREATE TABLE IF NOT EXISTS `notifications_new` (`notificationId` TEXT NOT NULL, `title` TEXT NOT NULL, `body` TEXT NOT NULL, `url` TEXT, `receivedAt` INTEGER NOT NULL, PRIMARY KEY(`notificationId`))");
                bVar.i("INSERT INTO `notifications_new` (`notificationId`, `title`, `body`, `url`, `receivedAt`) SELECT `notificationId`, `title`, `body`, `url`, `receivedAt` FROM `notifications`");
                bVar.i("DROP TABLE `notifications`");
                bVar.i("ALTER TABLE `notifications_new` RENAME TO `notifications`");
                break;
            case 4:
                bVar.i("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.i("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
                bVar.i("DROP TABLE IF EXISTS alarmInfo");
                bVar.i("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
                break;
            case 5:
                bVar.i("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
                break;
            case 6:
                bVar.i("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                bVar.i("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                break;
            case 7:
                bVar.i("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                break;
            case 8:
                bVar.i("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
                break;
            case 9:
                bVar.i("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                break;
            default:
                bVar.i("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                break;
        }
    }
}
