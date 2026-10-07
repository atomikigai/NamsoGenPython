package z2;

import a3.f;
import android.os.Build;
import c3.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f fVar, int i) {
        super(fVar);
        this.e = i;
    }

    @Override // z2.c
    public final boolean a(i iVar) {
        switch (this.e) {
            case 0:
                return iVar.f1750j.f8533b;
            case 1:
                return iVar.f1750j.f8535d;
            case 2:
                return iVar.f1750j.f8532a == 2;
            case 3:
                int i = iVar.f1750j.f8532a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                return iVar.f1750j.e;
        }
    }

    @Override // z2.c
    public final boolean b(Object obj) {
        boolean zBooleanValue;
        switch (this.e) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                y2.a aVar = (y2.a) obj;
                if (Build.VERSION.SDK_INT >= 26) {
                    return (aVar.f10537a && aVar.f10538b) ? false : true;
                }
                return true ^ aVar.f10537a;
            case 3:
                y2.a aVar2 = (y2.a) obj;
                return !aVar2.f10537a || aVar2.f10539c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
