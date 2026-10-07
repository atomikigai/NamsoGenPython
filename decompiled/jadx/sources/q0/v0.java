package q0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import app.namso_gen.spacehowen.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f7946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f7947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f7948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f7949d;
    public static final z e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f7950f;

    static {
        new AtomicInteger(1);
        f7946a = null;
        f7948c = false;
        f7949d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        e = new z();
        f7950f = new b0();
    }

    public static e1 a(View view) {
        if (f7946a == null) {
            f7946a = new WeakHashMap();
        }
        e1 e1Var = (e1) f7946a.get(view);
        if (e1Var != null) {
            return e1Var;
        }
        e1 e1Var2 = new e1(view);
        f7946a.put(view, e1Var2);
        return e1Var2;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = u0.f7942d;
        u0 u0Var = (u0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (u0Var == null) {
            u0Var = new u0();
            u0Var.f7943a = null;
            u0Var.f7944b = null;
            u0Var.f7945c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, u0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = u0Var.f7943a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = u0.f7942d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (u0Var.f7943a == null) {
                            u0Var.f7943a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = u0.f7942d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                u0Var.f7943a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    u0Var.f7943a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = u0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (u0Var.f7944b == null) {
                    u0Var.f7944b = new SparseArray();
                }
                u0Var.f7944b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return p0.a(view);
        }
        if (f7948c) {
            return null;
        }
        if (f7947b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f7947b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f7948c = true;
                return null;
            }
        }
        try {
            Object obj = f7947b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f7948c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = o0.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] f(l.t tVar) {
        return Build.VERSION.SDK_INT >= 31 ? r0.a(tVar) : (String[]) tVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z4 = d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (g0.a(view) != 0 || z4) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z4 ? 32 : 2048);
                g0.g(accessibilityEventObtain, i);
                if (z4) {
                    accessibilityEventObtain.getText().add(d(view));
                    if (d0.c(view) == 0) {
                        d0.s(view, 1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        g0.e(view.getParent(), view, view, i);
                        return;
                    } catch (AbstractMethodError e4) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e4);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            g0.g(accessibilityEventObtain2, i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static i h(View view, i iVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + iVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return r0.b(view, iVar);
        }
        u uVar = (u) view.getTag(R.id.tag_on_receive_content_listener);
        v vVar = e;
        if (uVar == null) {
            if (view instanceof v) {
                vVar = (v) view;
            }
            return vVar.a(iVar);
        }
        i iVarA = ((u0.t) uVar).a(view, iVar);
        if (iVarA == null) {
            return null;
        }
        if (view instanceof v) {
            vVar = (v) view;
        }
        return vVar.a(iVarA);
    }

    public static void i(View view, int i) {
        ArrayList arrayListE = e(view);
        for (int i10 = 0; i10 < arrayListE.size(); i10++) {
            if (((r0.f) arrayListE.get(i10)).a() == i) {
                arrayListE.remove(i10);
                return;
            }
        }
    }

    public static void j(View view, r0.f fVar, r0.x xVar) {
        c cVar;
        r0.f fVar2 = new r0.f(null, fVar.f8114b, null, xVar, fVar.f8115c);
        View.AccessibilityDelegate accessibilityDelegateC = c(view);
        if (accessibilityDelegateC == null) {
            cVar = null;
        } else {
            cVar = accessibilityDelegateC instanceof a ? ((a) accessibilityDelegateC).f7877a : new c(accessibilityDelegateC);
        }
        if (cVar == null) {
            cVar = new c();
        }
        l(view, cVar);
        i(view, fVar2.a());
        e(view).add(fVar2);
        g(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            p0.d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void l(View view, c cVar) {
        if (cVar == null && (c(view) instanceof a)) {
            cVar = new c();
        }
        if (d0.c(view) == 0) {
            d0.s(view, 1);
        }
        view.setAccessibilityDelegate(cVar == null ? null : cVar.f7887b);
    }

    public static void m(View view, CharSequence charSequence) {
        new a0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        b0 b0Var = f7950f;
        if (charSequence == null) {
            b0Var.f7882a.remove(view);
            view.removeOnAttachStateChangeListener(b0Var);
            d0.o(view.getViewTreeObserver(), b0Var);
        } else {
            b0Var.f7882a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(b0Var);
            if (g0.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(b0Var);
            }
        }
    }
}
