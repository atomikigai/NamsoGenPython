package a5;

import a4.j0;
import a4.k0;
import a4.y;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.f0;
import androidx.fragment.app.i0;
import androidx.fragment.app.s;
import androidx.viewpager2.widget.ViewPager2;
import app.namso_gen.spacehowen.R;
import app.namso_gen.spacehowen.SettingsActivity;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzdfa;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzfvi;
import com.google.android.gms.internal.ads.zzgee;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import e0.k;
import e2.h;
import g.u;
import h3.j2;
import ic.p;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import jc.i;
import k.e0;
import k.j;
import k.l;
import k.x;
import l.d2;
import l.p3;
import lb.r;
import o3.o;
import q0.b2;
import q0.d0;
import q0.h0;
import q0.r1;
import q0.t;
import q0.t1;
import q0.u1;
import q0.v0;
import q0.v1;
import v9.n;
import y1.w;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements y, a4.a, j0, OnCompleteListener, androidx.activity.result.b, t, ba.a, z0.f, u3.g, zzfvi, o3.c, d2, x, j, zzgee, r0.x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static b f186c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f188b;

    public /* synthetic */ b(int i) {
        this.f187a = i;
    }

    public static boolean s(FirebaseAuth firebaseAuth, s4.c cVar) {
        n nVar;
        return cVar.f8404w && (nVar = firebaseAuth.f2702f) != null && nVar.j();
    }

    public static void t(i2.d dVar) {
        dVar.i("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dVar.i("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        dVar.i("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        dVar.i("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        dVar.i("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        dVar.i("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        dVar.i("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dVar.i("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        dVar.i("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dVar.i("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dVar.i("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        dVar.i("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dVar.i("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        dVar.i("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dVar.i("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static synchronized b u() {
        try {
            if (f186c == null) {
                f186c = new b(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f186c;
    }

    public static w y(i2.d dVar) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new e2.e(1, "work_spec_id", "TEXT", null, true, 1));
        map.put("prerequisite_id", new e2.e(2, "prerequisite_id", "TEXT", null, true, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new e2.f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new e2.f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new e2.g("index_Dependency_work_spec_id", Arrays.asList("work_spec_id")));
        hashSet2.add(new e2.g("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id")));
        h hVar = new h("Dependency", map, hashSet, hashSet2);
        h hVarA = h.a(dVar, "Dependency");
        if (!hVar.equals(hVarA)) {
            return new w("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + hVar + "\n Found:\n" + hVarA, false);
        }
        HashMap map2 = new HashMap(25);
        map2.put("id", new e2.e(1, "id", "TEXT", null, true, 1));
        map2.put("state", new e2.e(0, "state", "INTEGER", null, true, 1));
        map2.put("worker_class_name", new e2.e(0, "worker_class_name", "TEXT", null, true, 1));
        map2.put("input_merger_class_name", new e2.e(0, "input_merger_class_name", "TEXT", null, false, 1));
        map2.put("input", new e2.e(0, "input", "BLOB", null, true, 1));
        map2.put("output", new e2.e(0, "output", "BLOB", null, true, 1));
        map2.put("initial_delay", new e2.e(0, "initial_delay", "INTEGER", null, true, 1));
        map2.put("interval_duration", new e2.e(0, "interval_duration", "INTEGER", null, true, 1));
        map2.put("flex_duration", new e2.e(0, "flex_duration", "INTEGER", null, true, 1));
        map2.put("run_attempt_count", new e2.e(0, "run_attempt_count", "INTEGER", null, true, 1));
        map2.put("backoff_policy", new e2.e(0, "backoff_policy", "INTEGER", null, true, 1));
        map2.put("backoff_delay_duration", new e2.e(0, "backoff_delay_duration", "INTEGER", null, true, 1));
        map2.put("period_start_time", new e2.e(0, "period_start_time", "INTEGER", null, true, 1));
        map2.put("minimum_retention_duration", new e2.e(0, "minimum_retention_duration", "INTEGER", null, true, 1));
        map2.put("schedule_requested_at", new e2.e(0, "schedule_requested_at", "INTEGER", null, true, 1));
        map2.put("run_in_foreground", new e2.e(0, "run_in_foreground", "INTEGER", null, true, 1));
        map2.put("out_of_quota_policy", new e2.e(0, "out_of_quota_policy", "INTEGER", null, true, 1));
        map2.put("required_network_type", new e2.e(0, "required_network_type", "INTEGER", null, false, 1));
        map2.put("requires_charging", new e2.e(0, "requires_charging", "INTEGER", null, true, 1));
        map2.put("requires_device_idle", new e2.e(0, "requires_device_idle", "INTEGER", null, true, 1));
        map2.put("requires_battery_not_low", new e2.e(0, "requires_battery_not_low", "INTEGER", null, true, 1));
        map2.put("requires_storage_not_low", new e2.e(0, "requires_storage_not_low", "INTEGER", null, true, 1));
        map2.put("trigger_content_update_delay", new e2.e(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
        map2.put("trigger_max_content_delay", new e2.e(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
        map2.put("content_uri_triggers", new e2.e(0, "content_uri_triggers", "BLOB", null, false, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new e2.g("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at")));
        hashSet4.add(new e2.g("index_WorkSpec_period_start_time", Arrays.asList("period_start_time")));
        h hVar2 = new h("WorkSpec", map2, hashSet3, hashSet4);
        h hVarA2 = h.a(dVar, "WorkSpec");
        if (!hVar2.equals(hVarA2)) {
            return new w("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + hVar2 + "\n Found:\n" + hVarA2, false);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new e2.e(1, "tag", "TEXT", null, true, 1));
        map3.put("work_spec_id", new e2.e(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new e2.f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new e2.g("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id")));
        h hVar3 = new h("WorkTag", map3, hashSet5, hashSet6);
        h hVarA3 = h.a(dVar, "WorkTag");
        if (!hVar3.equals(hVarA3)) {
            return new w("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + hVar3 + "\n Found:\n" + hVarA3, false);
        }
        HashMap map4 = new HashMap(2);
        map4.put("work_spec_id", new e2.e(1, "work_spec_id", "TEXT", null, true, 1));
        map4.put("system_id", new e2.e(0, "system_id", "INTEGER", null, true, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new e2.f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        h hVar4 = new h("SystemIdInfo", map4, hashSet7, new HashSet(0));
        h hVarA4 = h.a(dVar, "SystemIdInfo");
        if (!hVar4.equals(hVarA4)) {
            return new w("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + hVar4 + "\n Found:\n" + hVarA4, false);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new e2.e(1, "name", "TEXT", null, true, 1));
        map5.put("work_spec_id", new e2.e(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new e2.f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new e2.g("index_WorkName_work_spec_id", Arrays.asList("work_spec_id")));
        h hVar5 = new h("WorkName", map5, hashSet8, hashSet9);
        h hVarA5 = h.a(dVar, "WorkName");
        if (!hVar5.equals(hVarA5)) {
            return new w("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + hVar5 + "\n Found:\n" + hVarA5, false);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new e2.e(1, "work_spec_id", "TEXT", null, true, 1));
        map6.put("progress", new e2.e(0, "progress", "BLOB", null, true, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new e2.f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        h hVar6 = new h("WorkProgress", map6, hashSet10, new HashSet(0));
        h hVarA6 = h.a(dVar, "WorkProgress");
        if (!hVar6.equals(hVarA6)) {
            return new w("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + hVar6 + "\n Found:\n" + hVarA6, false);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new e2.e(1, "key", "TEXT", null, true, 1));
        map7.put("long_value", new e2.e(0, "long_value", "INTEGER", null, false, 1));
        h hVar7 = new h("Preference", map7, new HashSet(0), new HashSet(0));
        h hVarA7 = h.a(dVar, "Preference");
        if (hVar7.equals(hVarA7)) {
            return new w(null, true);
        }
        return new w("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + hVar7 + "\n Found:\n" + hVarA7, false);
    }

    @Override // z0.f
    public Object a(p pVar, ac.c cVar) {
        return ((z0.y) this.f188b).a(new d1.c(pVar, null, 0), cVar);
    }

    @Override // k.x
    public void b(l lVar, boolean z4) {
        if (lVar instanceof e0) {
            ((e0) lVar).K.k().c(false);
        }
        x xVar = ((l.j) this.f188b).e;
        if (xVar != null) {
            xVar.b(lVar, z4);
        }
    }

    @Override // r0.x
    public boolean c(View view) {
        a3.j jVar = (a3.j) this.f188b;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = (ViewPager2) jVar.f110d;
        if (viewPager2.C) {
            viewPager2.b(currentItem);
        }
        return true;
    }

    public a4.b d() {
        if (((zzbt) this.f188b) != null) {
            return new a4.b(this);
        }
        throw new IllegalArgumentException("Product list must be set to a non empty list.");
    }

    @Override // androidx.activity.result.b
    public void e(Object obj) {
        switch (this.f187a) {
            case 5:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                i0 i0Var = (i0) this.f188b;
                f0 f0Var = (f0) i0Var.f896w.pollFirst();
                if (f0Var != null) {
                    String str = f0Var.f866a;
                    int i = f0Var.f867b;
                    s sVarO = i0Var.f879c.o(str);
                    if (sVarO != null) {
                        sVarO.A(i, aVar.f386a, aVar.f387b);
                    } else {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                    }
                } else {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                }
                break;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f188b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f387b;
                int i10 = zzc.zzh(intent, "ProxyBillingActivityV2").f7495a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.H;
                if (resultReceiver != null) {
                    resultReceiver.send(i10, intent == null ? null : intent.getExtras());
                }
                int i11 = aVar2.f386a;
                if (i11 != -1 || i10 != 0) {
                    zzc.zzn("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // u3.g
    public void f(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l2 = (Long) obj;
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f188b)) {
            ((ByteBuffer) this.f188b).position(0);
            messageDigest.update(((ByteBuffer) this.f188b).putLong(l2.longValue()).array());
        }
    }

    @Override // k.j
    public boolean g(l lVar, MenuItem menuItem) {
        ((Toolbar) this.f188b).getClass();
        return false;
    }

    @Override // z0.f
    public uc.b getData() {
        return ((z0.y) this.f188b).f10947c;
    }

    @Override // k.x
    public boolean h(l lVar) {
        l.j jVar = (l.j) this.f188b;
        if (lVar == jVar.f6307c) {
            return false;
        }
        ((e0) lVar).L.getClass();
        jVar.getClass();
        x xVar = jVar.e;
        if (xVar != null) {
            return xVar.h(lVar);
        }
        return false;
    }

    @Override // a4.y
    public a4.x i(a4.e0 e0Var) {
        switch (this.f187a) {
            case 1:
                return new a4.c(0, (AssetManager) this.f188b, this);
            default:
                return new k0(this);
        }
    }

    @Override // k.j
    public void j(l lVar) {
        Toolbar toolbar = (Toolbar) this.f188b;
        l.j jVar = toolbar.f513a.E;
        if (jVar == null || !jVar.j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.R.f5062c).iterator();
            if (it.hasNext()) {
                throw q1.a.g(it);
            }
        }
    }

    @Override // q0.t
    public q0.d2 k(View view, q0.d2 d2Var) {
        boolean z4;
        q0.d2 d2VarB;
        boolean z10;
        switch (this.f187a) {
            case 6:
                b2 b2Var = d2Var.f7892a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f188b;
                if (!p0.b.a(coordinatorLayout.f577y, d2Var)) {
                    coordinatorLayout.f577y = d2Var;
                    boolean z11 = d2Var.d() > 0;
                    coordinatorLayout.f578z = z11;
                    coordinatorLayout.setWillNotDraw(!z11 && coordinatorLayout.getBackground() == null);
                    if (!b2Var.m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap = v0.f7946a;
                            if (!d0.b(childAt) || ((b0.e) childAt.getLayoutParams()).f1319a == null || !b2Var.m()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return d2Var;
            default:
                int iD = d2Var.d();
                u uVar = (u) this.f188b;
                Context context = uVar.f4105v;
                int iD2 = d2Var.d();
                ActionBarContextView actionBarContextView = uVar.G;
                if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    z4 = false;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) uVar.G.getLayoutParams();
                    if (uVar.G.isShown()) {
                        if (uVar.f4099n0 == null) {
                            uVar.f4099n0 = new Rect();
                            uVar.f4100o0 = new Rect();
                        }
                        Rect rect = uVar.f4099n0;
                        Rect rect2 = uVar.f4100o0;
                        rect.set(d2Var.b(), d2Var.d(), d2Var.c(), d2Var.a());
                        ViewGroup viewGroup = uVar.L;
                        Method method = p3.f6395a;
                        if (method != null) {
                            try {
                                method.invoke(viewGroup, rect, rect2);
                            } catch (Exception e) {
                                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                            }
                        }
                        int i10 = rect.top;
                        int i11 = rect.left;
                        int i12 = rect.right;
                        ViewGroup viewGroup2 = uVar.L;
                        WeakHashMap weakHashMap2 = v0.f7946a;
                        q0.d2 d2VarA = q0.k0.a(viewGroup2);
                        int iB = d2VarA == null ? 0 : d2VarA.b();
                        int iC = d2VarA == null ? 0 : d2VarA.c();
                        if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                            z10 = false;
                        } else {
                            marginLayoutParams.topMargin = i10;
                            marginLayoutParams.leftMargin = i11;
                            marginLayoutParams.rightMargin = i12;
                            z10 = true;
                        }
                        if (i10 <= 0 || uVar.N != null) {
                            View view2 = uVar.N;
                            if (view2 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                int i13 = marginLayoutParams2.height;
                                int i14 = marginLayoutParams.topMargin;
                                if (i13 != i14 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                                    marginLayoutParams2.height = i14;
                                    marginLayoutParams2.leftMargin = iB;
                                    marginLayoutParams2.rightMargin = iC;
                                    uVar.N.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        } else {
                            View view3 = new View(context);
                            uVar.N = view3;
                            view3.setVisibility(8);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                            layoutParams.leftMargin = iB;
                            layoutParams.rightMargin = iC;
                            uVar.L.addView(uVar.N, -1, layoutParams);
                        }
                        View view4 = uVar.N;
                        z4 = view4 != null;
                        if (z4 && view4.getVisibility() != 0) {
                            View view5 = uVar.N;
                            view5.setBackgroundColor((d0.g(view5) & 8192) != 0 ? k.getColor(context, R.color.abc_decor_view_status_guard_light) : k.getColor(context, R.color.abc_decor_view_status_guard));
                        }
                        if (!uVar.S && z4) {
                            iD2 = 0;
                        }
                        break;
                    } else if (marginLayoutParams.topMargin != 0) {
                        marginLayoutParams.topMargin = 0;
                        z4 = false;
                        z10 = true;
                    } else {
                        z10 = false;
                        z4 = false;
                    }
                    if (z10) {
                        uVar.G.setLayoutParams(marginLayoutParams);
                    }
                }
                View view6 = uVar.N;
                if (view6 != null) {
                    view6.setVisibility(z4 ? 0 : 8);
                }
                if (iD != iD2) {
                    int iB2 = d2Var.b();
                    int iC2 = d2Var.c();
                    int iA = d2Var.a();
                    int i15 = Build.VERSION.SDK_INT;
                    v1 u1Var = i15 >= 30 ? new u1(d2Var) : i15 >= 29 ? new t1(d2Var) : new r1(d2Var);
                    u1Var.g(h0.c.b(iB2, iD2, iC2, iA));
                    d2VarB = u1Var.b();
                } else {
                    d2VarB = d2Var;
                }
                WeakHashMap weakHashMap3 = v0.f7946a;
                WindowInsets windowInsetsF = d2VarB.f();
                if (windowInsetsF == null) {
                    return d2VarB;
                }
                WindowInsets windowInsetsB = h0.b(view, windowInsetsF);
                return !windowInsetsB.equals(windowInsetsF) ? q0.d2.g(view, windowInsetsB) : d2VarB;
        }
    }

    @Override // l.d2
    public void l(l lVar, k.n nVar) {
        k.f fVar = (k.f) this.f188b;
        Handler handler = fVar.f5839f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f5841s;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (lVar == ((k.e) arrayList.get(i)).f5834b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i10 = i + 1;
        handler.postAtTime(new d3.p(this, i10 < arrayList.size() ? (k.e) arrayList.get(i10) : null, nVar, lVar, 2), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // l.d2
    public void m(l lVar, MenuItem menuItem) {
        ((k.f) this.f188b).f5839f.removeCallbacksAndMessages(lVar);
    }

    @Override // a4.j0
    public com.bumptech.glide.load.data.e n(Uri uri) {
        return new com.bumptech.glide.load.data.a((ContentResolver) this.f188b, uri, 1);
    }

    @Override // a4.a
    public com.bumptech.glide.load.data.e o(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.k(assetManager, str, 0);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        rc.k kVar = (rc.k) this.f188b;
        Exception exception = task.getException();
        if (exception != null) {
            kVar.resumeWith(r7.g.m(exception));
        } else if (task.isCanceled()) {
            kVar.n(null);
        } else {
            kVar.resumeWith(task.getResult());
        }
    }

    @Override // ba.a
    public void p(Bundle bundle) {
        ((r9.c) ((r9.b) this.f188b)).a("clx", "_ae", bundle);
    }

    @Override // o3.c
    public void q(o3.e eVar) {
        SettingsActivity settingsActivity = (SettingsActivity) this.f188b;
        i.e(eVar, "billingResult");
        if (eVar.f7495a == 0) {
            int i = SettingsActivity.f1300e0;
            g gVar = new g();
            gVar.f199a = "monthly_subscription";
            gVar.f200b = "subs";
            List listD = jd.d.D(gVar.a());
            b bVar = new b(22);
            bVar.z(listD);
            a4.b bVarD = bVar.d();
            o3.b bVar2 = settingsActivity.M;
            if (bVar2 == null) {
                i.i("billingClient");
                throw null;
            }
            bVar2.x(bVarD, new j2(settingsActivity));
            i6.e eVar2 = new i6.e(2);
            eVar2.f5226b = "subs";
            ib.c cVarA = eVar2.a();
            o3.b bVar3 = settingsActivity.M;
            if (bVar3 != null) {
                bVar3.y(cVarA, new j2(settingsActivity));
            } else {
                i.i("billingClient");
                throw null;
            }
        }
    }

    @Override // o3.c
    public void r() {
        o3.b bVar = ((SettingsActivity) this.f188b).M;
        if (bVar != null) {
            bVar.z(this);
        } else {
            i.i("billingClient");
            throw null;
        }
    }

    public FirebaseAuth v(s4.c cVar) {
        n9.g gVarI;
        if (((FirebaseAuth) this.f188b) == null) {
            String str = cVar.f8394a;
            Set set = r4.e.f8153c;
            n9.g gVar = r4.e.a(n9.g.e(str)).f8157a;
            try {
                gVarI = n9.g.e("FUIScratchApp");
            } catch (IllegalStateException unused) {
                gVar.a();
                Context context = gVar.f7359a;
                gVar.a();
                gVarI = n9.g.i(context, "FUIScratchApp", gVar.f7361c);
            }
            this.f188b = FirebaseAuth.getInstance(gVarI);
        }
        return (FirebaseAuth) this.f188b;
    }

    public void w(r rVar) {
        i.e(rVar, "sessionEvent");
        ((l5.p) ((i5.e) ((ya.b) this.f188b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.b("json"), new a(this, 20)).i(new i5.a(rVar, i5.c.f5209a), new ga.a(28));
    }

    public void x(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((d9.h) this.f188b).a(0);
    }

    public void z(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (!"play_pass_subs".equals(oVar.f7513b)) {
                hashSet.add(oVar.f7513b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        this.f188b = zzbt.zzj(list);
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public void zza(zzfvh zzfvhVar) {
        com.google.android.gms.common.api.internal.h0 h0Var = (com.google.android.gms.common.api.internal.h0) this.f188b;
        if (!TextUtils.isEmpty(zzfvhVar.zzb())) {
            if (!((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzlf)).booleanValue()) {
                h0Var.f2115b = zzfvhVar.zzb();
            }
        }
        switch (zzfvhVar.zza()) {
            case 8152:
                String str = "onLMDOverlayOpened";
                zzcaj.zze.execute(new b3.b(h0Var, str, new HashMap(), 4, false));
                break;
            case 8153:
                String str2 = "onLMDOverlayClicked";
                zzcaj.zze.execute(new b3.b(h0Var, str2, new HashMap(), 4, false));
                break;
            case 8155:
                String str3 = "onLMDOverlayClose";
                zzcaj.zze.execute(new b3.b(h0Var, str3, new HashMap(), 4, false));
                break;
            case 8157:
                h0Var.f2115b = null;
                h0Var.f2116c = null;
                h0Var.f2114a = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(zzfvhVar.zza()));
                zzcaj.zze.execute(new b3.b(h0Var, "onLMDOverlayFailedToOpen", map, 4, false));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public /* synthetic */ void zzb(Object obj) {
        ((zzdfa) this.f188b).zza((o6.r) obj);
    }

    public /* synthetic */ b(Object obj, int i) {
        this.f187a = i;
        this.f188b = obj;
    }

    public b(y7.a aVar, s5.j jVar) {
        this.f187a = 27;
        this.f188b = jVar;
        aVar.f10615a.zzC(new s9.c(this, 1));
    }

    public b(ib.c cVar) {
        this.f187a = 8;
        this.f188b = Collections.unmodifiableMap(new HashMap((HashMap) cVar.f5256b));
    }

    public b(Context context) {
        this.f187a = 21;
        i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f188b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public b(x9.o oVar) {
        this.f187a = 25;
        this.f188b = new AtomicReference();
        oVar.a(new a(this, 23));
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public void zza(Throwable th) {
        ((zzdfa) this.f188b).zzb(th.getMessage());
    }

    public b() {
        this.f187a = 10;
        this.f188b = ByteBuffer.allocate(8);
    }
}
