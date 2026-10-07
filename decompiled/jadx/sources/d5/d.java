package d5;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.util.Log;
import androidx.lifecycle.z;
import app.namso_gen.spacehowen.R;
import r4.i;
import s4.h;
import u4.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f2918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4.c f2919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u4.b f2920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2921d;

    public d(u4.c cVar) {
        this(cVar, null, cVar, R.string.fui_progress_dialog_loading);
    }

    public abstract void a(Exception exc);

    public abstract void b(Object obj);

    @Override // androidx.lifecycle.z
    public final void m(Object obj) {
        h hVar = (h) obj;
        int i = hVar.f8417a;
        g gVar = this.f2918a;
        if (i == 3) {
            gVar.i(this.f2921d);
            return;
        }
        gVar.b();
        if (hVar.f8420d) {
            return;
        }
        int i10 = hVar.f8417a;
        if (i10 == 1) {
            hVar.f8420d = true;
            b(hVar.f8418b);
            return;
        }
        if (i10 == 2) {
            hVar.f8420d = true;
            Exception exc = hVar.f8419c;
            u4.b bVar = this.f2920c;
            if (bVar == null) {
                boolean z4 = exc instanceof s4.d;
                u4.c cVar = this.f2919b;
                if (z4) {
                    s4.d dVar = (s4.d) exc;
                    cVar.startActivityForResult(dVar.f8408b, dVar.f8409c);
                    return;
                } else if (exc instanceof s4.e) {
                    s4.e eVar = (s4.e) exc;
                    PendingIntent pendingIntent = eVar.f8410b;
                    try {
                        cVar.startIntentSenderForResult(pendingIntent.getIntentSender(), eVar.f8411c, null, 0, 0, 0);
                        return;
                    } catch (IntentSender.SendIntentException e) {
                        cVar.u(i.d(e), 0);
                        return;
                    }
                }
            } else if (exc instanceof s4.d) {
                s4.d dVar2 = (s4.d) exc;
                bVar.startActivityForResult(dVar2.f8408b, dVar2.f8409c);
                return;
            } else if (exc instanceof s4.e) {
                s4.e eVar2 = (s4.e) exc;
                PendingIntent pendingIntent2 = eVar2.f8410b;
                try {
                    bVar.a0(pendingIntent2.getIntentSender(), eVar2.f8411c, null, 0, 0, 0, null);
                    return;
                } catch (IntentSender.SendIntentException e4) {
                    ((u4.c) bVar.T()).u(i.d(e4), 0);
                    return;
                }
            }
            Log.e("AuthUI", "A sign-in error occurred.", exc);
            a(exc);
        }
    }

    public d(u4.c cVar, u4.b bVar, g gVar, int i) {
        this.f2919b = cVar;
        this.f2920c = bVar;
        if (cVar == null && bVar == null) {
            throw new IllegalStateException("ResourceObserver must be attached to an Activity or a Fragment");
        }
        this.f2918a = gVar;
        this.f2921d = i;
    }
}
