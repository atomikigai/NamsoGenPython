package y1;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jc.e f10496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f10499d;
    public final ArrayList e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f10500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f10501g;
    public a4.g h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u f10502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f10503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q3.e f10504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f10505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f10506n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f10507o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10508p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10509q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f10510r;

    public s(Context context, Class cls, String str) {
        jc.i.e(context, "context");
        this.f10499d = new ArrayList();
        this.e = new ArrayList();
        this.f10502j = u.f10511a;
        this.f10503k = -1L;
        this.f10504l = new q3.e();
        this.f10505m = new LinkedHashSet();
        this.f10506n = new LinkedHashSet();
        this.f10507o = new ArrayList();
        this.f10508p = true;
        this.f10510r = true;
        this.f10496a = jc.r.a(cls);
        this.f10497b = context;
        this.f10498c = str;
    }

    public final void a(c2.a... aVarArr) {
        for (c2.a aVar : aVarArr) {
            Integer numValueOf = Integer.valueOf(aVar.f1729a);
            LinkedHashSet linkedHashSet = this.f10506n;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(aVar.f1730b));
        }
        c2.a[] aVarArr2 = (c2.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        q3.e eVar = this.f10504l;
        eVar.getClass();
        jc.i.e(aVarArr2, "migrations");
        for (c2.a aVar2 : aVarArr2) {
            eVar.e(aVar2);
        }
    }

    public final v b() {
        String name;
        androidx.emoji2.text.g gVarF;
        LinkedHashMap linkedHashMap;
        List list;
        int size;
        boolean[] zArr;
        Iterator it;
        h2.e eVarC;
        h2.e eVarC2;
        boolean zContainsKey;
        Executor executor = this.f10500f;
        if (executor == null && this.f10501g == null) {
            androidx.webkit.a aVar = m.a.f6958c;
            this.f10501g = aVar;
            this.f10500f = aVar;
        } else if (executor != null && this.f10501g == null) {
            this.f10501g = executor;
        } else if (executor == null) {
            this.f10500f = this.f10501g;
        }
        LinkedHashSet linkedHashSet = this.f10506n;
        jc.i.e(linkedHashSet, "migrationStartAndEndVersions");
        LinkedHashSet linkedHashSet2 = this.f10505m;
        jc.i.e(linkedHashSet2, "migrationsNotRequiredFrom");
        if (!linkedHashSet.isEmpty()) {
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(da.v.f(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ").toString());
                }
            }
        }
        h2.d eVar = this.h;
        if (eVar == null) {
            eVar = new b9.e(18);
        }
        h2.d dVar = eVar;
        if (this.f10503k > 0) {
            if (this.f10498c != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        boolean z4 = this.i;
        u uVar = this.f10502j;
        uVar.getClass();
        Context context = this.f10497b;
        jc.i.e(context, "context");
        if (uVar == u.f10511a) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            uVar = (activityManager == null || activityManager.isLowRamDevice()) ? u.f10512b : u.f10513c;
        }
        Executor executor2 = this.f10500f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = this.f10501g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        a aVar2 = new a(context, this.f10498c, dVar, this.f10504l, this.f10499d, z4, uVar, executor2, executor3, null, this.f10508p, this.f10509q, linkedHashSet2, null, null, null, this.e, this.f10507o, false, null, null);
        aVar2.f10412v = this.f10510r;
        jc.e eVar2 = this.f10496a;
        jc.i.e(eVar2, "<this>");
        Class clsA = eVar2.a();
        jc.i.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        Package r10 = clsA.getPackage();
        if (r10 == null || (name = r10.getName()) == null) {
            name = "";
        }
        String canonicalName = clsA.getCanonicalName();
        jc.i.b(canonicalName);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            jc.i.d(canonicalName, "substring(...)");
        }
        String strReplace = canonicalName.replace('.', '_');
        jc.i.d(strReplace, "replace(...)");
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsA.getClassLoader());
            jc.i.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            v vVar = (v) cls.getDeclaredConstructor(null).newInstance(null);
            vVar.getClass();
            vVar.f10522k = aVar2.f10412v;
            try {
                gVarF = vVar.f();
                jc.i.c(gVarF, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
                while (true) {
                    int i = -1;
                    if (!it.hasNext()) {
                        int size2 = list.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i10 = size2 - 1;
                                if (size2 >= size || !zArr[size2]) {
                                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                }
                                if (i10 < 0) {
                                    break;
                                }
                                size2 = i10;
                            }
                        }
                        for (c2.a aVar3 : vVar.d(linkedHashMap)) {
                            int i11 = aVar3.f1729a;
                            int i12 = aVar3.f1730b;
                            q3.e eVar3 = aVar2.f10397d;
                            LinkedHashMap linkedHashMap2 = (LinkedHashMap) eVar3.f7990a;
                            if (linkedHashMap2.containsKey(Integer.valueOf(i11))) {
                                Map map = (Map) linkedHashMap2.get(Integer.valueOf(i11));
                                if (map == null) {
                                    map = vb.r.f9298a;
                                }
                                zContainsKey = map.containsKey(Integer.valueOf(i12));
                            } else {
                                zContainsKey = false;
                            }
                            if (!zContainsKey) {
                                eVar3.e(aVar3);
                            }
                        }
                        LinkedHashMap linkedHashMapK = vVar.k();
                        List list2 = aVar2.f10407q;
                        boolean[] zArr2 = new boolean[list2.size()];
                        for (Map.Entry entry : linkedHashMapK.entrySet()) {
                            nc.b bVar = (nc.b) entry.getKey();
                            for (nc.b bVar2 : (List) entry.getValue()) {
                                int size3 = list2.size() - 1;
                                if (size3 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                while (true) {
                                    int i13 = size3 - 1;
                                    if (((jc.e) bVar2).d(list2.get(size3))) {
                                        zArr2[size3] = true;
                                        break;
                                    }
                                    if (i13 < 0) {
                                        size3 = -1;
                                        break;
                                    }
                                    size3 = i13;
                                }
                                if (size3 < 0) {
                                    throw new IllegalArgumentException(("A required type converter (" + ((jc.e) bVar2).b() + ") for " + ((jc.e) bVar).b() + " is missing in the database configuration.").toString());
                                }
                                Object obj = list2.get(size3);
                                jc.i.e(bVar2, "kclass");
                                jc.i.e(obj, "converter");
                                vVar.f10521j.put(bVar2, obj);
                            }
                        }
                        int size4 = list2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i14 = size4 - 1;
                                if (!zArr2[size4]) {
                                    throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                }
                                if (i14 < 0) {
                                    break;
                                }
                                size4 = i14;
                            }
                        }
                        vVar.f10517c = aVar2.h;
                        vVar.f10518d = new g.a0(aVar2.i);
                        Executor executor4 = vVar.f10517c;
                        if (executor4 == null) {
                            jc.i.i("internalQueryExecutor");
                            throw null;
                        }
                        wc.e eVarB = rc.b0.b(com.bumptech.glide.d.x(rc.b0.j(executor4), rc.b0.c()));
                        vVar.f10515a = eVarB;
                        yb.i iVar = eVarB.f9927a;
                        g.a0 a0Var = vVar.f10518d;
                        if (a0Var == null) {
                            jc.i.i("internalTransactionExecutor");
                            throw null;
                        }
                        vVar.f10516b = iVar.B(rc.b0.j(a0Var));
                        vVar.h = aVar2.f10398f;
                        h6.m mVar = vVar.e;
                        if (mVar == null) {
                            jc.i.i("connectionManager");
                            throw null;
                        }
                        h2.e eVarC3 = mVar.c();
                        if (eVarC3 == null) {
                            eVarC = null;
                            break;
                        }
                        eVarC = eVarC3;
                        while (!(eVarC instanceof d2.b)) {
                            if (!(eVarC instanceof b)) {
                                eVarC = null;
                                break;
                            }
                            eVarC = ((b) eVarC).c();
                        }
                        h6.m mVar2 = vVar.e;
                        if (mVar2 == null) {
                            jc.i.i("connectionManager");
                            throw null;
                        }
                        h2.e eVarC4 = mVar2.c();
                        if (eVarC4 == null) {
                            eVarC2 = null;
                            break;
                        }
                        eVarC2 = eVarC4;
                        while (!(eVarC2 instanceof d2.a)) {
                            if (!(eVarC2 instanceof b)) {
                                eVarC2 = null;
                                break;
                            }
                            eVarC2 = ((b) eVarC2).c();
                        }
                        return vVar;
                    }
                    nc.b bVar3 = (nc.b) it.next();
                    int size5 = list.size() - 1;
                    if (size5 >= 0) {
                        while (true) {
                            int i15 = size5 - 1;
                            if (((jc.e) bVar3).d(list.get(size5))) {
                                zArr[size5] = true;
                                i = size5;
                                break;
                            }
                            if (i15 < 0) {
                                break;
                            }
                            size5 = i15;
                        }
                    }
                    if (i < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + ((jc.e) bVar3).b() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(bVar3, list.get(i));
                }
            } catch (ub.e unused) {
                gVarF = null;
            }
            vVar.e = gVarF == null ? new h6.m(aVar2, new h3.c(vVar, 7)) : new h6.m(aVar2, gVarF);
            vVar.f10519f = vVar.e();
            linkedHashMap = new LinkedHashMap();
            Set setJ = vVar.j();
            list = aVar2.f10408r;
            size = list.size();
            zArr = new boolean[size];
            it = setJ.iterator();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + clsA.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot access the constructor " + clsA.getCanonicalName(), e4);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to create an instance of " + clsA.getCanonicalName(), e10);
        }
    }
}
