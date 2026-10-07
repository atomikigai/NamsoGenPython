package u2;

import androidx.work.impl.WorkDatabase;
import y1.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends t {
    @Override // y1.t
    public final void a(h2.b bVar) {
        jc.i.e(bVar, "db");
        bVar.e();
        try {
            int i = WorkDatabase.f1252m;
            bVar.i("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f1251l) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            bVar.u();
        } finally {
            bVar.C();
        }
    }
}
