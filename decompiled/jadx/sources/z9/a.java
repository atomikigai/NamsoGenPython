package z9;

import a2.l;
import aa.d;
import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import da.q;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import r9.e;
import s5.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ca.a, ba.a, ya.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f11526a;

    public /* synthetic */ a(f fVar) {
        this.f11526a = fVar;
    }

    @Override // ca.a
    public void a(q qVar) {
        f fVar = this.f11526a;
        synchronized (fVar) {
            try {
                if (((ca.a) fVar.f764c) instanceof ca.b) {
                    ((ArrayList) fVar.f763b).add(qVar);
                }
                ((ca.a) fVar.f764c).a(qVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ya.a
    public void b(ya.b bVar) {
        f fVar = this.f11526a;
        d dVar = d.f265a;
        dVar.b("AnalyticsConnector now available.");
        r9.b bVar2 = (r9.b) bVar.get();
        a5.b bVar3 = new a5.b(bVar2, 7);
        j jVar = new j(27, false);
        r9.c cVar = (r9.c) bVar2;
        e eVarB = cVar.b("clx", jVar);
        if (eVarB == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            eVarB = cVar.b("crash", jVar);
            if (eVarB != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (eVarB == null) {
            dVar.d("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        dVar.b("Registered Firebase Analytics listener.");
        ib.c cVar2 = new ib.c(8, false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l lVar = new l(bVar3);
        synchronized (fVar) {
            try {
                ArrayList arrayList = (ArrayList) fVar.f763b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    cVar2.a((q) obj);
                }
                jVar.f8446c = cVar2;
                jVar.f8445b = lVar;
                fVar.f764c = cVar2;
                fVar.f762a = lVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ba.a
    public void p(Bundle bundle) {
        ((ba.a) this.f11526a.f762a).p(bundle);
    }
}
