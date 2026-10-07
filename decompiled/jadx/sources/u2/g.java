package u2;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8806c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f8807d;

    public g(Context context, int i, int i10) {
        super(i, i10);
        this.f8807d = context;
    }

    @Override // c2.a
    public final void a(h2.b bVar) {
        switch (this.f8806c) {
            case 0:
                if (this.f1730b >= 10) {
                    bVar.s(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f8807d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                bVar.i("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f8807d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j4 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j10 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    bVar.e();
                    try {
                        bVar.s(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j4)});
                        bVar.s(new Object[]{"reschedule_needed", Long.valueOf(j10)});
                        sharedPreferences.edit().clear().apply();
                        bVar.u();
                        bVar.C();
                    } catch (Throwable th) {
                        bVar.C();
                        throw th;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i10 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    bVar.e();
                    try {
                        bVar.s(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        bVar.s(new Object[]{"next_alarm_manager_id", Integer.valueOf(i10)});
                        sharedPreferences2.edit().clear().apply();
                        bVar.u();
                        return;
                    } finally {
                        bVar.C();
                    }
                }
                return;
        }
    }

    public g(Context context) {
        super(9, 10);
        this.f8807d = context;
    }
}
