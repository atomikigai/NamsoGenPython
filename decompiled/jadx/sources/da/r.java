package da;

import android.util.Log;
import java.io.File;
import java.util.NavigableSet;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f3141b;

    public /* synthetic */ r(s sVar, int i) {
        this.f3140a = i;
        this.f3141b = sVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3140a) {
            case 0:
                try {
                    aa.c cVar = this.f3141b.e;
                    ia.b bVar = (ia.b) cVar.f264c;
                    String str = (String) cVar.f263b;
                    bVar.getClass();
                    boolean zDelete = new File(bVar.f5246b, str).delete();
                    if (!zDelete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(zDelete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                p pVar = this.f3141b.f3147g;
                aa.c cVar2 = pVar.f3127c;
                ia.b bVar2 = (ia.b) cVar2.f264c;
                String str2 = (String) cVar2.f263b;
                bVar2.getClass();
                boolean z4 = true;
                if (new File(bVar2.f5246b, str2).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ia.b bVar3 = (ia.b) cVar2.f264c;
                    bVar3.getClass();
                    new File(bVar3.f5246b, str2).delete();
                } else {
                    NavigableSet navigableSetC = ((ia.a) pVar.f3134m.f1681b).c();
                    String str3 = navigableSetC.isEmpty() ? null : (String) navigableSetC.first();
                    if (str3 == null || !pVar.f3131j.c(str3)) {
                        z4 = false;
                    }
                }
                return Boolean.valueOf(z4);
        }
    }
}
