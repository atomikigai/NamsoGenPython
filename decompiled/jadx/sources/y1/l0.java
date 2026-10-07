package y1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f10482l = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f10483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f10484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10486d;
    public final h e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f10488g;
    public final com.bumptech.glide.manager.q h;
    public final o6.h0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f10489j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ic.a f10490k = new i2.c(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f10487f = new LinkedHashMap();

    public l0(v vVar, HashMap map, HashMap map2, String[] strArr, boolean z4, h hVar) {
        String lowerCase;
        this.f10483a = vVar;
        this.f10484b = map;
        this.f10485c = map2;
        this.f10486d = z4;
        this.e = hVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            jc.i.d(lowerCase2, "toLowerCase(...)");
            this.f10487f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.f10484b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                jc.i.d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.f10488g = strArr2;
        for (Map.Entry entry : this.f10484b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            jc.i.d(lowerCase3, "toLowerCase(...)");
            if (this.f10487f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                jc.i.d(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap = this.f10487f;
                jc.i.e(linkedHashMap, "<this>");
                Object obj = linkedHashMap.get(lowerCase3);
                if (obj == null && !linkedHashMap.containsKey(lowerCase3)) {
                    throw new NoSuchElementException("Key " + ((Object) lowerCase3) + " is missing in the map.");
                }
                linkedHashMap.put(lowerCase4, obj);
            }
        }
        int length2 = this.f10488g.length;
        com.bumptech.glide.manager.q qVar = new com.bumptech.glide.manager.q();
        qVar.f1933b = new ReentrantLock();
        qVar.f1934c = new long[length2];
        qVar.f1935d = new boolean[length2];
        this.h = qVar;
        this.i = new o6.h0(this.f10488g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(l0 l0Var, o oVar, ac.c cVar) {
        c0 c0Var;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i = c0Var.f10419d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0Var.f10419d = i - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(l0Var, cVar);
            }
        } else {
            c0Var = new c0(l0Var, cVar);
        }
        Object objB = c0Var.f10417b;
        zb.a aVar = zb.a.f11555a;
        int i10 = c0Var.f10419d;
        if (i10 == 0) {
            r7.g.G(objB);
            h3.o oVar2 = new h3.o(19);
            c0Var.f10416a = oVar;
            c0Var.f10419d = 1;
            objB = oVar.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1", oVar2, c0Var);
            if (objB != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) c0Var.f10416a;
            r7.g.G(objB);
            return set;
        }
        oVar = (o) c0Var.f10416a;
        r7.g.G(objB);
        Set set2 = (Set) objB;
        if (!set2.isEmpty()) {
            c0Var.f10416a = set2;
            c0Var.f10419d = 2;
            if (c.d(oVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", c0Var) == aVar) {
                return aVar;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object b(l0 l0Var, ac.c cVar) throws Throwable {
        f0 f0Var;
        s5.j jVar;
        Object objR;
        Throwable th;
        s5.j jVar2;
        v vVar = l0Var.f10483a;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i = f0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                f0Var.e = i - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(l0Var, cVar);
            }
        } else {
            f0Var = new f0(l0Var, cVar);
        }
        Object obj = f0Var.f10433c;
        zb.a aVar = zb.a.f11555a;
        int i10 = f0Var.e;
        if (i10 == 0) {
            r7.g.G(obj);
            jVar = vVar.f10520g;
            boolean zD = jVar.d();
            vb.s sVar = vb.s.f9299a;
            if (!zD) {
                return sVar;
            }
            try {
                if (!l0Var.f10489j.compareAndSet(true, false)) {
                    jVar.D();
                    return sVar;
                }
                if (!((Boolean) l0Var.f10490k.a()).booleanValue()) {
                    jVar.D();
                    return sVar;
                }
                g0 g0Var = new g0(l0Var, null, 1);
                f0Var.f10431a = l0Var;
                f0Var.f10432b = jVar;
                f0Var.e = 1;
                objR = vVar.r(false, g0Var, f0Var);
                if (objR == aVar) {
                    return aVar;
                }
            } catch (Throwable th2) {
                s5.j jVar3 = jVar;
                th = th2;
                jVar2 = jVar3;
                jVar2.D();
                throw th;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar2 = f0Var.f10432b;
            l0 l0Var2 = f0Var.f10431a;
            try {
                r7.g.G(obj);
                jVar = jVar2;
                l0Var = l0Var2;
                objR = obj;
            } catch (Throwable th3) {
                th = th3;
                jVar2.D();
                throw th;
            }
        }
        Set set = (Set) objR;
        if (!set.isEmpty()) {
            l0Var.i.e(set);
            l0Var.e.invoke(set);
        }
        jVar.D();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0091  */
    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    /* JADX WARN: Code duplicated, block: B:24:0x009a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (y1.c.d(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e8, code lost:
    
        if (y1.c.d(r10, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ea, code lost:
    
        return r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e8 -> B:28:0x00eb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(y1.l0 r17, y1.b0 r18, int r19, ac.c r20) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.l0.c(y1.l0, y1.b0, int, ac.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008d -> B:19:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(y1.l0 r8, y1.b0 r9, int r10, ac.c r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof y1.i0
            if (r0 == 0) goto L16
            r0 = r11
            y1.i0 r0 = (y1.i0) r0
            int r1 = r0.f10462s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f10462s = r1
            goto L1b
        L16:
            y1.i0 r0 = new y1.i0
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f10460f
            zb.a r1 = zb.a.f11555a
            int r2 = r0.f10462s
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.e
            int r9 = r0.f10459d
            java.lang.String[] r10 = r0.f10458c
            java.lang.String r2 = r0.f10457b
            y1.o r4 = r0.f10456a
            r7.g.G(r11)
            r11 = r10
            r10 = r4
            goto L90
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            r7.g.G(r11)
            java.lang.String[] r8 = r8.f10488g
            r8 = r8[r10]
            java.lang.String[] r10 = y1.l0.f10482l
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L50:
            if (r9 >= r8) goto L92
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DROP TRIGGER IF EXISTS `"
            r5.<init>(r6)
            r5.append(r4)
            r4 = 96
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r0.f10456a = r10
            r0.f10457b = r2
            r0.f10458c = r11
            r0.f10459d = r9
            r0.e = r8
            r0.f10462s = r3
            java.lang.Object r4 = y1.c.d(r10, r4, r0)
            if (r4 != r1) goto L90
            return r1
        L90:
            int r9 = r9 + r3
            goto L50
        L92:
            ub.k r8 = ub.k.f9073a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.l0.d(y1.l0, y1.b0, int, ac.c):java.lang.Object");
    }

    public final void e(ic.a aVar, ic.a aVar2) {
        jc.i.e(aVar, "onRefreshScheduled");
        jc.i.e(aVar2, "onRefreshCompleted");
        if (this.f10489j.compareAndSet(false, true)) {
            aVar.a();
            wc.e eVar = this.f10483a.f10515a;
            yb.d dVar = null;
            if (eVar != null) {
                rc.b0.q(eVar, new rc.z(), new a2.g(this, aVar2, dVar, 24), 2);
            } else {
                jc.i.i("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ac.c cVar) throws Throwable {
        j0 j0Var;
        s5.j jVar;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i = j0Var.f10467d;
            if ((i & Integer.MIN_VALUE) != 0) {
                j0Var.f10467d = i - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(this, cVar);
            }
        } else {
            j0Var = new j0(this, cVar);
        }
        Object obj = j0Var.f10465b;
        zb.a aVar = zb.a.f11555a;
        int i10 = j0Var.f10467d;
        if (i10 == 0) {
            r7.g.G(obj);
            v vVar = this.f10483a;
            s5.j jVar2 = vVar.f10520g;
            if (jVar2.d()) {
                try {
                    g0 g0Var = new g0(this, null, 2);
                    j0Var.f10464a = jVar2;
                    j0Var.f10467d = 1;
                    if (vVar.r(false, g0Var, j0Var) == aVar) {
                        return aVar;
                    }
                    jVar = jVar2;
                    jVar.D();
                } catch (Throwable th) {
                    th = th;
                    jVar = jVar2;
                    jVar.D();
                    throw th;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = j0Var.f10464a;
            try {
                r7.g.G(obj);
                jVar.D();
            } catch (Throwable th2) {
                th = th2;
                jVar.D();
                throw th;
            }
        }
        return ub.k.f9073a;
    }
}
