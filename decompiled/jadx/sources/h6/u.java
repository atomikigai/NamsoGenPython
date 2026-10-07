package h6;

import com.google.android.gms.internal.ads.zzaqu;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends zzaqu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f5085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f5086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i6.g f5087c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i, String str, v vVar, aa.c cVar, byte[] bArr, Map map, i6.g gVar) {
        super(i, str, vVar, cVar);
        this.f5085a = bArr;
        this.f5086b = map;
        this.f5087c = gVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final Map zzl() {
        Map map = this.f5086b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final byte[] zzx() {
        byte[] bArr = this.f5085a;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaqu, com.google.android.gms.internal.ads.zzapp
    /* JADX INFO: renamed from: zzz */
    public final void zzo(String str) {
        if (i6.g.c() && str != null) {
            this.f5087c.d("onNetworkResponseBody", new a4.b(str.getBytes(), 16));
        }
        super.zzo(str);
    }
}
