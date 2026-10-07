package o9;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f7694g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    public static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Date f7698d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7699f;

    public b(String str, String str2, String str3, Date date, long j4, long j10) {
        this.f7695a = str;
        this.f7696b = str2;
        this.f7697c = str3;
        this.f7698d = date;
        this.e = j4;
        this.f7699f = j10;
    }

    public final r9.a a() {
        r9.a aVar = new r9.a();
        aVar.f8219a = "frc";
        aVar.f8228m = this.f7698d.getTime();
        aVar.f8220b = this.f7695a;
        aVar.f8221c = this.f7696b;
        String str = this.f7697c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        aVar.f8222d = str;
        aVar.e = this.e;
        aVar.f8225j = this.f7699f;
        return aVar;
    }
}
