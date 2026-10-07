package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {
    protected final l mLifecycleFragment;

    public LifecycleCallback(l lVar) {
        this.mLifecycleFragment = lVar;
    }

    private static l getChimeraLifecycleFragmentImpl(k kVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static l getFragment(Activity activity) {
        return getFragment(new k(activity));
    }

    public Activity getActivity() {
        Activity activityG = this.mLifecycleFragment.g();
        com.google.android.gms.common.internal.i0.i(activityG);
        return activityG;
    }

    public static l getFragment(k kVar) {
        e1 e1Var;
        f1 f1Var;
        Activity activity = kVar.f2123a;
        if (!(activity instanceof androidx.fragment.app.w)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = e1.f2078d;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (e1Var = (e1) weakReference.get()) != null) {
                return e1Var;
            }
            try {
                e1 e1Var2 = (e1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (e1Var2 == null || e1Var2.isRemoving()) {
                    e1Var2 = new e1();
                    activity.getFragmentManager().beginTransaction().add(e1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(e1Var2));
                return e1Var2;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        androidx.fragment.app.w wVar = (androidx.fragment.app.w) activity;
        WeakHashMap weakHashMap2 = f1.f2094i0;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(wVar);
        if (weakReference2 != null && (f1Var = (f1) weakReference2.get()) != null) {
            return f1Var;
        }
        try {
            f1 f1Var2 = (f1) wVar.p().y("SupportLifecycleFragmentImpl");
            if (f1Var2 == null || f1Var2.f983w) {
                f1Var2 = new f1();
                androidx.fragment.app.i0 i0VarP = wVar.p();
                i0VarP.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(i0VarP);
                aVar.h(0, f1Var2, "SupportLifecycleFragmentImpl", 1);
                aVar.e(true);
            }
            weakHashMap2.put(wVar, new WeakReference(f1Var2));
            return f1Var2;
        } catch (ClassCastException e4) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e4);
        }
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public static l getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public void onActivityResult(int i, int i10, Intent intent) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
