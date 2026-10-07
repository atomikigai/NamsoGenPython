package za;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f11551b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f11552c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static j f11553d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9.e f11554a;

    public j(b9.e eVar) {
        this.f11554a = eVar;
    }

    public final boolean a(ab.b bVar) {
        if (TextUtils.isEmpty(bVar.f274c)) {
            return true;
        }
        long j4 = bVar.f276f + bVar.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f11554a.getClass();
        return j4 < timeUnit.toSeconds(System.currentTimeMillis()) + f11551b;
    }
}
