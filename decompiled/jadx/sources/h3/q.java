package h3;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import app.namso_gen.spacehowen.FcmService;
import app.namso_gen.spacehowen.MainActivity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4804a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4807d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Object obj, d1.d dVar, nb.h hVar, yb.d dVar2) {
        super(2, dVar2);
        this.f4806c = obj;
        this.f4807d = dVar;
        this.e = hVar;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f4804a) {
            case 0:
                return new q((String) this.f4805b, (String) this.f4806c, (FcmService) this.f4807d, (i3.o) this.e, dVar);
            default:
                q qVar = new q(this.f4806c, (d1.d) this.f4807d, (nb.h) this.e, dVar);
                qVar.f4805b = obj;
                return qVar;
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4804a) {
            case 0:
                q qVar = (q) create((rc.a0) obj, (yb.d) obj2);
                ub.k kVar = ub.k.f9073a;
                qVar.invokeSuspend(kVar);
                return kVar;
            default:
                q qVar2 = (q) create((d1.b) obj, (yb.d) obj2);
                ub.k kVar2 = ub.k.f9073a;
                qVar2.invokeSuspend(kVar2);
                return kVar2;
        }
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        Intent intent;
        int i = this.f4804a;
        ub.k kVar = ub.k.f9073a;
        Object obj2 = this.e;
        Object obj3 = this.f4806c;
        Object obj4 = this.f4807d;
        switch (i) {
            case 0:
                FcmService fcmService = (FcmService) obj4;
                zb.a aVar = zb.a.f11555a;
                r7.g.G(obj);
                String str = (String) this.f4805b;
                Bitmap bitmapE = str != null ? FcmService.e(fcmService, str) : null;
                String str2 = (String) obj3;
                Bitmap bitmapE2 = str2 != null ? FcmService.e(fcmService, str2) : null;
                i3.o oVar = (i3.o) obj2;
                String str3 = oVar.f5194d;
                int i10 = FcmService.f1282r;
                String str4 = oVar.f5193c;
                String str5 = oVar.f5192b;
                String str6 = oVar.f5191a;
                if (str3 == null || str3.length() == 0) {
                    intent = new Intent(fcmService, (Class<?>) MainActivity.class);
                } else {
                    intent = new Intent("android.intent.action.VIEW", Uri.parse(str3)).addFlags(268435456);
                    jc.i.d(intent, "addFlags(...)");
                }
                PendingIntent activity = PendingIntent.getActivity(fcmService, str6.hashCode(), intent, 201326592);
                d0.t tVar = new d0.t(fcmService, "urgent_v2");
                tVar.f2784s.icon = 2131230940;
                tVar.e = d0.t.b(str5);
                tVar.f2773f = d0.t.b(str4);
                tVar.c(true);
                tVar.f2774g = activity;
                tVar.f2775j = 1;
                if (bitmapE != null) {
                    tVar.d(bitmapE);
                }
                if (bitmapE2 != null) {
                    d0.p pVar = new d0.p();
                    IconCompat iconCompat = new IconCompat(1);
                    iconCompat.f586b = bitmapE2;
                    pVar.e = iconCompat;
                    pVar.f2787b = d0.t.b(str5);
                    pVar.f2788c = d0.t.b(str4);
                    pVar.f2789d = true;
                    tVar.e(pVar);
                }
                Notification notificationA = tVar.a();
                jc.i.d(notificationA, "build(...)");
                notificationA.flags |= 32;
                Object systemService = fcmService.getSystemService("notification");
                jc.i.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).notify(str6.hashCode(), notificationA);
                return kVar;
            default:
                d1.d dVar = (d1.d) obj4;
                zb.a aVar2 = zb.a.f11555a;
                r7.g.G(obj);
                d1.b bVar = (d1.b) this.f4805b;
                if (obj3 != null) {
                    bVar.getClass();
                    jc.i.e(dVar, "key");
                    bVar.c(dVar, obj3);
                } else {
                    bVar.getClass();
                    jc.i.e(dVar, "key");
                    if (bVar.f2792b.get()) {
                        throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
                    }
                    bVar.f2791a.remove(dVar);
                }
                nb.h.a((nb.h) obj2, bVar);
                return kVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, String str2, FcmService fcmService, i3.o oVar, yb.d dVar) {
        super(2, dVar);
        this.f4805b = str;
        this.f4806c = str2;
        this.f4807d = fcmService;
        this.e = oVar;
    }
}
