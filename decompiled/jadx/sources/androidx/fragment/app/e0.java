package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends com.bumptech.glide.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f863m;

    public /* synthetic */ e0(int i) {
        this.f863m = i;
    }

    @Override // com.bumptech.glide.d
    public final Intent g(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f863m) {
            case 0:
                androidx.activity.result.h hVar = (androidx.activity.result.h) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = hVar.f403b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = hVar.f402a;
                        jc.i.e(intentSender, "intentSender");
                        hVar = new androidx.activity.result.h(intentSender, null, hVar.f404c, hVar.f405d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
                if (i0.D(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] strArr = (String[]) obj;
                jc.i.e(strArr, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                jc.i.d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            case 2:
                String str = (String) obj;
                jc.i.e(str, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                jc.i.d(intentPutExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra2;
            case 3:
                Intent intent3 = (Intent) obj;
                jc.i.e(intent3, "input");
                return intent3;
            case 4:
                androidx.activity.result.h hVar2 = (androidx.activity.result.h) obj;
                jc.i.e(hVar2, "input");
                Intent intentPutExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar2);
                jc.i.d(intentPutExtra3, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
                return intentPutExtra3;
            default:
                return (Intent) obj;
        }
    }

    @Override // com.bumptech.glide.d
    public a4.b s(Context context, Object obj) {
        switch (this.f863m) {
            case 1:
                String[] strArr = (String[]) obj;
                jc.i.e(strArr, "input");
                if (strArr.length == 0) {
                    return new a4.b(vb.r.f9298a, 9);
                }
                for (String str : strArr) {
                    if (e0.k.checkSelfPermission(context, str) != 0) {
                        return null;
                    }
                }
                int iA = vb.t.A(strArr.length);
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new a4.b(linkedHashMap, 9);
            case 2:
                String str3 = (String) obj;
                jc.i.e(str3, "input");
                if (e0.k.checkSelfPermission(context, str3) == 0) {
                    return new a4.b(Boolean.TRUE, 9);
                }
                return null;
            default:
                return super.s(context, obj);
        }
    }

    @Override // com.bumptech.glide.d
    public final Object w(Intent intent, int i) {
        switch (this.f863m) {
            case 0:
                return new androidx.activity.result.a(intent, i);
            case 1:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i10 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i10 == 0));
                        }
                        ArrayList arrayListO = vb.h.O(stringArrayExtra);
                        Iterator it = arrayListO.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(vb.k.U(arrayListO), vb.k.U(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new ub.f(it.next(), it2.next()));
                        }
                        return vb.t.D(arrayList2);
                    }
                }
                return vb.r.f9298a;
            case 2:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z4 = false;
                if (intArrayExtra2 != null) {
                    for (int i11 : intArrayExtra2) {
                        if (i11 == 0) {
                            z4 = true;
                        }
                    }
                }
                return Boolean.valueOf(z4);
            case 3:
                return new androidx.activity.result.a(intent, i);
            case 4:
                return new androidx.activity.result.a(intent, i);
            default:
                return new s4.b(Integer.valueOf(i), r4.i.b(intent));
        }
    }
}
