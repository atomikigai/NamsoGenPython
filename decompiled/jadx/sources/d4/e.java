package d4;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements u3.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2874b;

    public /* synthetic */ e(Object obj, int i) {
        this.f2873a = i;
        this.f2874b = obj;
    }

    @Override // u3.k
    public final w3.x a(Object obj, int i, int i10, u3.i iVar) {
        switch (this.f2873a) {
            case 0:
                o oVar = (o) this.f2874b;
                return oVar.a(new a2.l((ByteBuffer) obj, oVar.f2895d, oVar.f2894c, 8), i, i10, iVar, o.f2890j);
            case 1:
                o oVar2 = (o) this.f2874b;
                return oVar2.a(new a2.l((ParcelFileDescriptor) obj, oVar2.f2895d, oVar2.f2894c), i, i10, iVar, o.f2890j);
            default:
                return c.c(((t3.d) obj).b(), (x3.a) this.f2874b);
        }
    }

    @Override // u3.k
    public final boolean b(Object obj, u3.i iVar) {
        switch (this.f2873a) {
            case 0:
                ((o) this.f2874b).getClass();
                return true;
            case 1:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
            default:
                return true;
        }
    }
}
