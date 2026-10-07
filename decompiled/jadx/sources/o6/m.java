package o6;

import com.google.android.gms.internal.ads.zzhfx;
import com.google.android.gms.internal.ads.zzhgf;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements zzhfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f7650b;

    public /* synthetic */ m(k kVar, int i) {
        this.f7649a = i;
        this.f7650b = kVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        switch (this.f7649a) {
            case 0:
                String lowerCase = this.f7650b.f7647a.toLowerCase(Locale.ROOT);
                zzhgf.zzb(lowerCase);
                return lowerCase;
            default:
                k kVar = this.f7650b;
                kVar.getClass();
                HashSet hashSet = new HashSet();
                hashSet.add(kVar.f7647a.toLowerCase(Locale.ROOT));
                return hashSet;
        }
    }
}
