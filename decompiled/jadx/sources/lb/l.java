package lb;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import h6.o0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import rc.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9.g f6924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nb.f f6925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f6926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f6927d;

    public l(n9.g gVar, za.d dVar, x xVar, x xVar2, ya.b bVar) {
        this.f6924a = gVar;
        b bVarA = s.a(gVar);
        gVar.a();
        Context context = gVar.f7359a;
        jc.i.d(context, "firebaseApp.applicationContext");
        nb.f fVar = new nb.f(context, xVar2, xVar, dVar, bVarA);
        this.f6925b = fVar;
        z9.c cVar = new z9.c();
        this.f6927d = new o0(9, dVar, new a5.b(bVar, 20));
        u uVar = new u(Math.random() <= fVar.a(), cVar);
        this.f6926c = uVar;
        androidx.viewpager2.adapter.c cVar2 = new androidx.viewpager2.adapter.c(cVar, xVar, new a4.b(this, 22), fVar, uVar);
        gVar.a();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks((gb.k) cVar2.f1200f);
            ga.a aVar = new ga.a(29);
            gVar.a();
            gVar.f7365j.add(aVar);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:54:0x0105  */
    /* JADX WARN: Code duplicated, block: B:56:0x0109  */
    /* JADX WARN: Code duplicated, block: B:58:0x010f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0115  */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0121 A[Catch: IllegalStateException -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x0031, blocks: (B:13:0x002d, B:64:0x0121), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x013c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(l lVar, q qVar, ac.c cVar) {
        k kVar;
        l lVar2;
        Map map;
        nb.f fVar;
        Bundle bundle;
        Boolean boolValueOf;
        nb.c cVar2;
        Boolean bool;
        r rVarB;
        o0 o0Var;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i = kVar.f6923f;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.f6923f = i - Integer.MIN_VALUE;
            } else {
                kVar = new k(lVar, cVar);
            }
        } else {
            kVar = new k(lVar, cVar);
        }
        Object objB = kVar.f6922d;
        zb.a aVar = zb.a.f11555a;
        int i10 = kVar.f6923f;
        boolean zBooleanValue = true;
        ub.k kVar2 = ub.k.f9073a;
        try {
            if (i10 == 0) {
                r7.g.G(objB);
                mb.c cVar3 = mb.c.f7093a;
                kVar.f6919a = lVar;
                kVar.f6920b = qVar;
                kVar.f6923f = 1;
                objB = cVar3.b(kVar);
                if (objB != aVar) {
                }
                return aVar;
            }
            if (i10 == 1) {
                qVar = kVar.f6920b;
                lVar = kVar.f6919a;
                r7.g.G(objB);
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(objB);
                    return kVar2;
                }
                map = kVar.f6921c;
                qVar = kVar.f6920b;
                lVar2 = kVar.f6919a;
                r7.g.G(objB);
            }
            fVar = lVar2.f6925b;
            bundle = (Bundle) fVar.f7391a.f188b;
            if (bundle.containsKey("firebase_sessions_enabled")) {
                boolValueOf = Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
            } else {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            } else {
                cVar2 = fVar.f7392b.f7378c.f7401b;
                if (cVar2 != null) {
                    jc.i.i("sessionConfigs");
                    throw null;
                }
                bool = cVar2.f7380a;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
            }
            if (!zBooleanValue) {
                Log.d("FirebaseSessions", "Sessions SDK disabled. Events will not be sent.");
                return kVar2;
            }
            if (!lVar2.f6926c.f6946a) {
                Log.d("FirebaseSessions", "Sessions SDK has dropped this session due to sampling.");
                return kVar2;
            }
            ta.c cVar4 = s.f6944a;
            rVarB = s.b(lVar2.f6924a, qVar, lVar2.f6925b, map);
            o0Var = lVar2.f6927d;
            kVar.f6919a = null;
            kVar.f6920b = null;
            kVar.f6921c = null;
            kVar.f6923f = 3;
            if (o0Var.a(rVarB, kVar) != aVar) {
                return aVar;
            }
            return kVar2;
            Map map2 = (Map) objB;
            if (map2.isEmpty()) {
                Log.d("FirebaseSessions", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
                return kVar2;
            }
            Iterator it = map2.values().iterator();
            while (it.hasNext()) {
                ((da.l) it.next()).a(new mb.e(qVar.f6938a));
            }
            Collection collectionValues = map2.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it2 = collectionValues.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!((da.l) it2.next()).f3113a.a());
                Log.d("FirebaseSessions", "Data Collection is enabled for at least one Subscriber");
                nb.f fVar2 = lVar.f6925b;
                kVar.f6919a = lVar;
                kVar.f6920b = qVar;
                kVar.f6921c = map2;
                kVar.f6923f = 2;
                if (fVar2.b(kVar) != aVar) {
                    lVar2 = lVar;
                    map = map2;
                    fVar = lVar2.f6925b;
                    bundle = (Bundle) fVar.f7391a.f188b;
                    if (bundle.containsKey("firebase_sessions_enabled")) {
                        boolValueOf = Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
                    } else {
                        boolValueOf = null;
                    }
                    if (boolValueOf != null) {
                        zBooleanValue = boolValueOf.booleanValue();
                    } else {
                        cVar2 = fVar.f7392b.f7378c.f7401b;
                        if (cVar2 != null) {
                            jc.i.i("sessionConfigs");
                            throw null;
                        }
                        bool = cVar2.f7380a;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                    }
                    if (!zBooleanValue) {
                        Log.d("FirebaseSessions", "Sessions SDK disabled. Events will not be sent.");
                        return kVar2;
                    }
                    if (!lVar2.f6926c.f6946a) {
                        Log.d("FirebaseSessions", "Sessions SDK has dropped this session due to sampling.");
                        return kVar2;
                    }
                    ta.c cVar5 = s.f6944a;
                    rVarB = s.b(lVar2.f6924a, qVar, lVar2.f6925b, map);
                    o0Var = lVar2.f6927d;
                    kVar.f6919a = null;
                    kVar.f6920b = null;
                    kVar.f6921c = null;
                    kVar.f6923f = 3;
                    if (o0Var.a(rVarB, kVar) != aVar) {
                        return kVar2;
                    }
                }
                return aVar;
            }
            Log.d("FirebaseSessions", "Data Collection is disabled for all subscribers. Skipping this Session Event");
            return kVar2;
        } catch (IllegalStateException e) {
            Log.w("FirebaseSessions", "FirebaseApp is not initialized. Sessions library will not collect session data.", e);
            return kVar2;
        }
    }
}
