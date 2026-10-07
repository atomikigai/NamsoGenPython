package kb;

import android.content.SharedPreferences;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static final Date e = new Date(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Date f6182f = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6184b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6185c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6186d = new Object();

    public k(SharedPreferences sharedPreferences) {
        this.f6183a = sharedPreferences;
    }

    public final j a() {
        j jVar;
        synchronized (this.f6185c) {
            int i = this.f6183a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f6183a.getLong("backoff_end_time_in_millis", -1L));
            jVar = new j();
            jVar.f6180a = i;
            jVar.f6181b = date;
        }
        return jVar;
    }

    public final j b() {
        j jVar;
        synchronized (this.f6186d) {
            int i = this.f6183a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f6183a.getLong("realtime_backoff_end_time_in_millis", -1L));
            jVar = new j();
            jVar.f6180a = i;
            jVar.f6181b = date;
        }
        return jVar;
    }

    public final void c(int i, Date date) {
        synchronized (this.f6185c) {
            this.f6183a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void d(int i, Date date) {
        synchronized (this.f6186d) {
            this.f6183a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
