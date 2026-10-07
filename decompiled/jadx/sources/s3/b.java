package s3;

import com.bumptech.glide.manager.q;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f8366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File[] f8367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File[] f8368d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f8369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f8370g;

    public b(c cVar, String str) {
        this.f8370g = cVar;
        this.f8365a = str;
        int i = cVar.f8376r;
        File file = cVar.f8371a;
        this.f8366b = new long[i];
        this.f8367c = new File[i];
        this.f8368d = new File[i];
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i10 = 0; i10 < i; i10++) {
            sb2.append(i10);
            this.f8367c[i10] = new File(file, sb2.toString());
            sb2.append(".tmp");
            this.f8368d[i10] = new File(file, sb2.toString());
            sb2.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        for (long j4 : this.f8366b) {
            sb2.append(' ');
            sb2.append(j4);
        }
        return sb2.toString();
    }
}
