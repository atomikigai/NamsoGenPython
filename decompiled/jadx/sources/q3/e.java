package q3;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import r0.x;
import v9.g0;
import w9.a0;
import z7.a1;
import z7.c3;
import z7.j0;
import z7.x1;
import z7.z2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements x, n5.b, Continuation, uc.b, q4.a, c3, j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7990a;

    public /* synthetic */ e(Object obj) {
        this.f7990a = obj;
    }

    @Override // z7.j0
    public void b(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((z2) this.f7990a).h(str, i, th, bArr, map);
    }

    @Override // r0.x
    public boolean c(View view) {
        a3.j jVar = (a3.j) this.f7990a;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) jVar.f110d;
        if (viewPager2.C) {
            viewPager2.b(currentItem);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4, types: [ac.i, ic.p] */
    @Override // uc.b
    public Object d(uc.c cVar, yb.d dVar) throws Throwable {
        uc.a aVar;
        Throwable th;
        vc.k kVar;
        if (dVar instanceof uc.a) {
            aVar = (uc.a) dVar;
            int i = aVar.f9079d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f9079d = i - Integer.MIN_VALUE;
            } else {
                aVar = new uc.a(this, dVar);
            }
        } else {
            aVar = new uc.a(this, dVar);
        }
        Object obj = aVar.f9077b;
        zb.a aVar2 = zb.a.f11555a;
        int i10 = aVar.f9079d;
        ub.k kVar2 = ub.k.f9073a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = aVar.f9076a;
            try {
                r7.g.G(obj);
                kVar.releaseIntercepted();
                return kVar2;
            } catch (Throwable th2) {
                th = th2;
                kVar.releaseIntercepted();
                throw th;
            }
        }
        r7.g.G(obj);
        vc.k kVar3 = new vc.k(cVar, aVar.getContext());
        try {
            aVar.f9076a = kVar3;
            aVar.f9079d = 1;
            Object objInvoke = ((ac.i) this.f7990a).invoke(kVar3, aVar);
            if (objInvoke != aVar2) {
                objInvoke = kVar2;
            }
            if (objInvoke == aVar2) {
                return aVar2;
            }
            kVar = kVar3;
            kVar.releaseIntercepted();
            return kVar2;
        } catch (Throwable th3) {
            th = th3;
            kVar = kVar3;
            kVar.releaseIntercepted();
            throw th;
        }
    }

    public void e(c2.a aVar) {
        jc.i.e(aVar, "migration");
        int i = aVar.f1729a;
        int i10 = aVar.f1730b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7990a;
        Integer numValueOf = Integer.valueOf(i);
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i10))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i10)) + " with " + aVar);
        }
        treeMap2.put(Integer.valueOf(i10), aVar);
    }

    public void f(k kVar, com.bumptech.glide.manager.q qVar, a3.e eVar) {
        synchronized (kVar.e) {
            kVar.f8014v = true;
        }
        kVar.a("post-response");
        ((d0) this.f7990a).execute(new b3.b(kVar, qVar, eVar, 15, false));
    }

    @Override // q4.a
    public Object g() {
        e6.q qVar = (e6.q) this.f7990a;
        return new w3.n((z3.d) qVar.f3390a, (z3.d) qVar.f3391b, (z3.d) qVar.f3392c, (z3.d) qVar.f3393d, (w3.k) qVar.e, (w3.k) qVar.f3394f, (a2.l) qVar.f3395g);
    }

    @Override // tb.a
    public Object get() {
        return new s5.l((Context) ((tb.a) this.f7990a).get(), "com.google.android.datatransport.events", Integer.valueOf(s5.l.f8449d).intValue());
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z4;
        a0 a0Var = (a0) task.getResult();
        w9.d0 d0Var = a0Var.f9802a;
        String str = d0Var.f9820b.f9808c;
        Uri uriH = d0Var.h();
        if (!TextUtils.isEmpty(str) && uriH != null) {
            return Tasks.forResult(a0Var);
        }
        s4.i iVar = ((r4.i) this.f7990a).f8165a;
        if (TextUtils.isEmpty(str)) {
            str = iVar.f8424d;
        }
        if (uriH == null) {
            uriH = iVar.e;
        }
        boolean z10 = true;
        if (str == null) {
            z4 = true;
            str = null;
        } else {
            z4 = false;
        }
        if (uriH == null) {
            uriH = null;
        } else {
            z10 = false;
        }
        v9.d0 d0Var2 = new v9.d0(str, uriH != null ? uriH.toString() : null, z4, z10);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(n9.g.e(d0Var.f9821c));
        firebaseAuth.getClass();
        return firebaseAuth.e.zzP(firebaseAuth.f2698a, d0Var, d0Var2, new g0(firebaseAuth, 0)).addOnFailureListener(new a5.g("ProfileMerger", "Error updating profile")).continueWithTask(new f5.c(a0Var, 1));
    }

    @Override // z7.c3
    public void zza(String str, Bundle bundle) {
        x1 x1Var = (x1) this.f7990a;
        if (!TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        ((a1) x1Var.f159a).f11012y.getClass();
        x1Var.j("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    public e(Handler handler) {
        this.f7990a = new d0(handler, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(ic.p pVar) {
        this.f7990a = (ac.i) pVar;
    }

    public e() {
        this.f7990a = new LinkedHashMap();
    }
}
