package y1;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2.d f10396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q3.e f10397d;
    public final List e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f10399g;
    public final Executor h;
    public final Executor i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Intent f10400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f10401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f10403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f10404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final File f10405o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Callable f10406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f10407q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f10408r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f10409s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g2.b f10410t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final yb.i f10411u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10412v;

    public a(Context context, String str, h2.d dVar, q3.e eVar, List list, boolean z4, u uVar, Executor executor, Executor executor2, Intent intent, boolean z10, boolean z11, Set set, String str2, File file, Callable callable, List list2, List list3, boolean z12, g2.b bVar, yb.i iVar) {
        jc.i.e(context, "context");
        jc.i.e(eVar, "migrationContainer");
        jc.i.e(executor, "queryExecutor");
        jc.i.e(executor2, "transactionExecutor");
        jc.i.e(list2, "typeConverters");
        jc.i.e(list3, "autoMigrationSpecs");
        this.f10394a = context;
        this.f10395b = str;
        this.f10396c = dVar;
        this.f10397d = eVar;
        this.e = list;
        this.f10398f = z4;
        this.f10399g = uVar;
        this.h = executor;
        this.i = executor2;
        this.f10400j = intent;
        this.f10401k = z10;
        this.f10402l = z11;
        this.f10403m = set;
        this.f10404n = str2;
        this.f10405o = file;
        this.f10406p = callable;
        this.f10407q = list2;
        this.f10408r = list3;
        this.f10409s = z12;
        this.f10410t = bVar;
        this.f10411u = iVar;
        this.f10412v = true;
    }
}
