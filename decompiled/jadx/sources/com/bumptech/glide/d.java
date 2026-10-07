package com.bumptech.glide;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import da.v;
import fa.w;
import h3.o;
import h6.o0;
import ic.p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import l.k2;
import q0.g0;
import q0.j0;
import q0.m;
import q0.u0;
import q0.v0;
import rc.b0;
import rc.k0;
import rc.r1;
import t2.n;
import v9.q;
import x1.h0;
import x1.s0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f1845a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f1846b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f1847c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f1848d = false;
    public static Field e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f1849f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f1850g = null;
    public static boolean h = false;
    public static boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Method f1851j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f1852k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f1853l;

    public static void A(View view, b9.g gVar) {
        r8.a aVar = gVar.f1454a.f1441b;
        if (aVar == null || !aVar.f8215a) {
            return;
        }
        float fI = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = v0.f7946a;
            fI += j0.i((View) parent);
        }
        b9.f fVar = gVar.f1454a;
        if (fVar.f1448l != fI) {
            fVar.f1448l = fI;
            gVar.n();
        }
    }

    public static void B(Parcel parcel, int i10, Boolean bool) {
        if (bool == null) {
            return;
        }
        R(parcel, i10, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void C(Parcel parcel, int i10, Bundle bundle, boolean z4) {
        if (bundle == null) {
            if (z4) {
                R(parcel, i10, 0);
            }
        } else {
            int iP = P(i10, parcel);
            parcel.writeBundle(bundle);
            Q(iP, parcel);
        }
    }

    public static void D(Parcel parcel, int i10, byte[] bArr, boolean z4) {
        if (bArr == null) {
            if (z4) {
                R(parcel, i10, 0);
            }
        } else {
            int iP = P(i10, parcel);
            parcel.writeByteArray(bArr);
            Q(iP, parcel);
        }
    }

    public static void E(Parcel parcel, int i10, Double d10) {
        if (d10 == null) {
            return;
        }
        R(parcel, i10, 8);
        parcel.writeDouble(d10.doubleValue());
    }

    public static void F(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iP = P(i10, parcel);
        parcel.writeStrongBinder(iBinder);
        Q(iP, parcel);
    }

    public static void G(Parcel parcel, int i10, int[] iArr, boolean z4) {
        if (iArr == null) {
            if (z4) {
                R(parcel, i10, 0);
            }
        } else {
            int iP = P(i10, parcel);
            parcel.writeIntArray(iArr);
            Q(iP, parcel);
        }
    }

    public static void H(Parcel parcel, int i10, Integer num) {
        if (num == null) {
            return;
        }
        R(parcel, i10, 4);
        parcel.writeInt(num.intValue());
    }

    public static void I(Parcel parcel, int i10, Long l2) {
        if (l2 == null) {
            return;
        }
        R(parcel, i10, 8);
        parcel.writeLong(l2.longValue());
    }

    public static void J(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z4) {
        if (parcelable == null) {
            if (z4) {
                R(parcel, i10, 0);
            }
        } else {
            int iP = P(i10, parcel);
            parcelable.writeToParcel(parcel, i11);
            Q(iP, parcel);
        }
    }

    public static void K(Parcel parcel, int i10, String str, boolean z4) {
        if (str == null) {
            if (z4) {
                R(parcel, i10, 0);
            }
        } else {
            int iP = P(i10, parcel);
            parcel.writeString(str);
            Q(iP, parcel);
        }
    }

    public static void L(Parcel parcel, int i10, String[] strArr, boolean z4) {
        if (strArr == null) {
            if (z4) {
                R(parcel, i10, 0);
            }
        } else {
            int iP = P(i10, parcel);
            parcel.writeStringArray(strArr);
            Q(iP, parcel);
        }
    }

    public static void M(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iP = P(i10, parcel);
        parcel.writeStringList(list);
        Q(iP, parcel);
    }

    public static void N(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int iP = P(i10, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i11);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        Q(iP, parcel);
    }

    public static void O(Parcel parcel, int i10, List list, boolean z4) {
        if (list == null) {
            if (z4) {
                R(parcel, i10, 0);
                return;
            }
            return;
        }
        int iP = P(i10, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        Q(iP, parcel);
    }

    public static int P(int i10, Parcel parcel) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void Q(int i10, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    public static void R(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    public static void a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbD = u3.b.d(i10, i11, "fromIndex: ", ", toIndex: ", ", size: ");
            sbD.append(i12);
            throw new IndexOutOfBoundsException(sbD.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(q1.a.i(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }

    public static int b(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    public static int c(s0 s0Var, androidx.emoji2.text.g gVar, View view, View view2, h0 h0Var, boolean z4) {
        if (h0Var.v() == 0 || s0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return Math.abs(h0.F(view) - h0.F(view2)) + 1;
        }
        return Math.min(gVar.n(), gVar.d(view2) - gVar.g(view));
    }

    public static int d(s0 s0Var, androidx.emoji2.text.g gVar, View view, View view2, h0 h0Var, boolean z4, boolean z10) {
        if (h0Var.v() == 0 || s0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z10 ? Math.max(0, (s0Var.b() - Math.max(h0.F(view), h0.F(view2))) - 1) : Math.max(0, Math.min(h0.F(view), h0.F(view2)));
        if (z4) {
            return Math.round((iMax * (Math.abs(gVar.d(view2) - gVar.g(view)) / (Math.abs(h0.F(view) - h0.F(view2)) + 1))) + (gVar.m() - gVar.g(view)));
        }
        return iMax;
    }

    public static int e(s0 s0Var, androidx.emoji2.text.g gVar, View view, View view2, h0 h0Var, boolean z4) {
        if (h0Var.v() == 0 || s0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return s0Var.b();
        }
        return (int) (((gVar.d(view2) - gVar.g(view)) / (Math.abs(h0.F(view) - h0.F(view2)) + 1)) * s0Var.b());
    }

    public static c f(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? new b9.i() : new b9.d();
        }
        return new b9.i();
    }

    public static final boolean h(String str, String str2) {
        jc.i.e(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < str.length()) {
                char cCharAt = str.charAt(i10);
                int i13 = i12 + 1;
                if (i12 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i11++;
                    } else if (cCharAt == ')' && (i11 = i11 - 1) == 0 && i12 != str.length() - 1) {
                    }
                    i10++;
                    i12 = i13;
                }
            }
            if (i11 == 0) {
                String strSubstring = str.substring(1, str.length() - 1);
                jc.i.d(strSubstring, "substring(...)");
                return jc.i.a(pc.g.B0(strSubstring).toString(), str2);
            }
        }
        return false;
    }

    public static boolean i(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = v0.f7946a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = u0.f7942d;
        u0 u0Var = (u0) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (u0Var == null) {
            u0Var = new u0();
            u0Var.f7943a = null;
            u0Var.f7944b = null;
            u0Var.f7945c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, u0Var);
        }
        WeakReference weakReference2 = u0Var.f7945c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        u0Var.f7945c = new WeakReference(keyEvent);
        if (u0Var.f7944b == null) {
            u0Var.f7944b = new SparseArray();
        }
        SparseArray sparseArray = u0Var.f7944b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !g0.b(view2) || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        throw v.e(arrayList, size);
    }

    public static boolean j(m mVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (mVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return mVar.a(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!i) {
                            try {
                                f1851j = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            i = true;
                        }
                        Method method = f1851j;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (v0.b(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f1852k) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f1853l = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f1852k = true;
                }
                Field field = f1853l;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (v0.b(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && v0.b(view, keyEvent)) || mVar.a(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static Task l(FirebaseAuth firebaseAuth, s4.c cVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new NullPointerException("Email cannot be empty"));
        }
        firebaseAuth.getClass();
        i0.e(str);
        return firebaseAuth.e.zzf(firebaseAuth.f2698a, str, firebaseAuth.f2705k).continueWithTask(new ib.c(cVar, 3));
    }

    public static final String m(Collection collection) {
        jc.i.e(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return pc.h.V(vb.i.e0(collection, ",\n", "\n", "\n", null, 56)) + "},";
    }

    public static yb.g n(yb.g gVar, yb.h hVar) {
        jc.i.e(hVar, "key");
        if (jc.i.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static v9.d o(r4.i iVar) {
        v9.d dVar = iVar.f8166b;
        boolean z4 = dVar != null;
        String str = iVar.f8167c;
        if (z4) {
            return dVar;
        }
        String strE = iVar.e();
        strE.getClass();
        if (strE.equals("google.com")) {
            return new q(str, null);
        }
        if (strE.equals("facebook.com")) {
            return new v9.f(str);
        }
        return null;
    }

    public static r4.c p(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r4.c cVar = (r4.c) it.next();
            if (cVar.f8145a.equals(str)) {
                return cVar;
            }
        }
        return null;
    }

    public static r4.c q(String str, List list) {
        r4.c cVarP = p(str, list);
        if (cVarP != null) {
            return cVarP;
        }
        throw new IllegalStateException(v.i("Provider ", str, " not found."));
    }

    public static Drawable r(Context context, int i10) {
        return k2.b().c(context, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static oc.f t(p pVar) {
        oc.f fVar = new oc.f();
        fVar.f7713d = ((ac.a) pVar).create(fVar, fVar);
        return fVar;
    }

    public static yb.i u(yb.g gVar, yb.h hVar) {
        jc.i.e(hVar, "key");
        return jc.i.a(gVar.getKey(), hVar) ? yb.j.f10674a : gVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, q3.g[]] */
    public static w v(Context context) {
        o0 o0Var = new o0(new b9.e(29));
        r3.c cVar = new r3.c(new o0(context.getApplicationContext(), 28));
        q3.e eVar = new q3.e(new Handler(Looper.getMainLooper()));
        w wVar = new w();
        wVar.f3865a = new AtomicInteger();
        wVar.f3866b = new HashSet();
        wVar.f3867c = new PriorityBlockingQueue();
        wVar.f3868d = new PriorityBlockingQueue();
        wVar.f3871j = new ArrayList();
        wVar.f3872k = new ArrayList();
        wVar.e = cVar;
        wVar.f3869f = o0Var;
        wVar.h = new q3.g[4];
        wVar.f3870g = eVar;
        q3.c cVar2 = (q3.c) wVar.i;
        if (cVar2 != null) {
            cVar2.e = true;
            cVar2.interrupt();
        }
        for (q3.g gVar : (q3.g[]) wVar.h) {
            if (gVar != null) {
                gVar.e = true;
                gVar.interrupt();
            }
        }
        q3.c cVar3 = new q3.c((PriorityBlockingQueue) wVar.f3867c, (PriorityBlockingQueue) wVar.f3868d, (r3.c) wVar.e, (q3.e) wVar.f3870g);
        wVar.i = cVar3;
        cVar3.start();
        for (int i10 = 0; i10 < ((q3.g[]) wVar.h).length; i10++) {
            q3.g gVar2 = new q3.g((PriorityBlockingQueue) wVar.f3868d, (o0) wVar.f3869f, (r3.c) wVar.e, (q3.e) wVar.f3870g);
            ((q3.g[]) wVar.h)[i10] = gVar2;
            gVar2.start();
        }
        return wVar;
    }

    public static yb.i x(yb.g gVar, yb.i iVar) {
        jc.i.e(iVar, "context");
        return iVar == yb.j.f10674a ? gVar : (yb.i) iVar.G(gVar, new yb.b(1));
    }

    public static c1.c y(String str, o oVar, int i10) {
        ic.l lVar = oVar;
        if ((i10 & 4) != 0) {
            lVar = c1.a.f1718a;
        }
        yc.c cVar = k0.f8293b;
        r1 r1VarC = b0.c();
        cVar.getClass();
        return new c1.c(str, lVar, b0.b(x(cVar, r1VarC)));
    }

    public static String z(String str) {
        switch (str.hashCode()) {
            case -1830313082:
                if (str.equals("twitter.com")) {
                    return "https://twitter.com";
                }
                return null;
            case -1536293812:
                if (str.equals("google.com")) {
                    return "https://accounts.google.com";
                }
                return null;
            case -364826023:
                if (str.equals("facebook.com")) {
                    return "https://www.facebook.com";
                }
                return null;
            case 106642798:
                if (str.equals("phone")) {
                    return "https://phone.firebase";
                }
                return null;
            case 1216985755:
                str.equals("password");
                return null;
            case 1985010934:
                if (str.equals("github.com")) {
                    return "https://github.com";
                }
                return null;
            default:
                return null;
        }
    }

    public abstract Intent g(Context context, Object obj);

    public void k(n nVar) {
        List listSingletonList = Collections.singletonList(nVar);
        u2.j jVar = (u2.j) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        u2.e eVar = new u2.e(jVar, listSingletonList);
        if (eVar.e) {
            t2.m.d().h(u2.e.f8801f, v.i("Already enqueued work ids (", TextUtils.join(", ", eVar.f8804c), ")"), new Throwable[0]);
        } else {
            jVar.f8822p.m(new d3.d(eVar));
        }
    }

    public a4.b s(Context context, Object obj) {
        return null;
    }

    public abstract Object w(Intent intent, int i10);
}
