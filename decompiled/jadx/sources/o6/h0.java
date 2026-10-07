package o6;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import androidx.datastore.preferences.protobuf.d1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.zzgdo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import x1.n0;
import x1.w0;
import z7.a1;
import z7.j0;
import z7.l0;
import z7.p0;
import z7.z2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class h0 implements zzgdo, n5.b, q4.a, j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7621a;

    public /* synthetic */ h0(Object obj) {
        this.f7621a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void a(y1.e0 e0Var, ac.c cVar) {
        y1.m mVar;
        if (cVar instanceof y1.m) {
            mVar = (y1.m) cVar;
            int i = mVar.f10493c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mVar.f10493c = i - Integer.MIN_VALUE;
            } else {
                mVar = new y1.m(this, cVar);
            }
        } else {
            mVar = new y1.m(this, cVar);
        }
        Object obj = mVar.f10491a;
        zb.a aVar = zb.a.f11555a;
        int i10 = mVar.f10493c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r7.g.G(obj);
            throw new d1();
        }
        r7.g.G(obj);
        uc.i iVar = (uc.i) this.f7621a;
        mVar.f10493c = 1;
        iVar.d(e0Var, mVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006d A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:15:0x0066, B:17:0x006d, B:18:0x0075, B:19:0x0090, B:22:0x009c, B:23:0x00a3, B:27:0x00a7, B:28:0x00b7, B:30:0x00b9, B:32:0x00bd, B:35:0x00c4, B:36:0x00c5), top: B:61:0x0066, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee A[Catch: all -> 0x0014, SQLiteException -> 0x00ec, TryCatch #4 {SQLiteException -> 0x00ec, blocks: (B:14:0x002a, B:37:0x00cd, B:39:0x00e2, B:41:0x00e8, B:45:0x00f5, B:44:0x00ee, B:46:0x00f9, B:47:0x0101), top: B:65:0x002a, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x012e A[Catch: all -> 0x0014, PHI: r11
      0x012e: PHI (r11v19 int) = (r11v2 int), (r11v0 int) binds: [B:13:0x0028, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x0014, blocks: (B:4:0x0011, B:7:0x0017, B:49:0x012e, B:54:0x016d, B:53:0x0159, B:14:0x002a, B:37:0x00cd, B:39:0x00e2, B:41:0x00e8, B:45:0x00f5, B:44:0x00ee, B:46:0x00f9, B:47:0x0101, B:48:0x0102), top: B:62:0x0011, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0155  */
    /* JADX WARN: Code duplicated, block: B:53:0x0159 A[Catch: all -> 0x0014, TryCatch #2 {all -> 0x0014, blocks: (B:4:0x0011, B:7:0x0017, B:49:0x012e, B:54:0x016d, B:53:0x0159, B:14:0x002a, B:37:0x00cd, B:39:0x00e2, B:41:0x00e8, B:45:0x00f5, B:44:0x00ee, B:46:0x00f9, B:47:0x0101, B:48:0x0102), top: B:62:0x0011, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x009b A[SYNTHETIC] */
    @Override // z7.j0
    public void b(String str, int i, Throwable th, byte[] bArr, Map map) {
        int size;
        int i10;
        l0 l0Var;
        Long l2;
        z7.j jVar;
        long jLongValue;
        z2 z2Var = (z2) this.f7621a;
        z2Var.zzaB().c();
        z2Var.b();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                z2Var.E = false;
                z2Var.w();
                throw th2;
            }
        }
        ArrayList arrayList = z2Var.I;
        com.google.android.gms.common.internal.i0.i(arrayList);
        z2Var.I = null;
        if (i == 200) {
            if (th == null) {
                try {
                    p0 p0Var = z2Var.f11514t.f11259r;
                    ((n7.b) z2Var.zzax()).getClass();
                    p0Var.b(System.currentTimeMillis());
                    z2Var.f11514t.f11260s.b(0L);
                    z2Var.y();
                    z2Var.zzaA().f11198y.d(Integer.valueOf(i), "Successful upload. Got network response. code, size", Integer.valueOf(bArr.length));
                    z7.j jVar2 = z2Var.f11509c;
                    z2.D(jVar2);
                    jVar2.H();
                    try {
                        size = arrayList.size();
                        i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            l2 = (Long) obj;
                            try {
                                jVar = z2Var.f11509c;
                                z2.D(jVar);
                                jLongValue = l2.longValue();
                                jVar.c();
                                jVar.d();
                                try {
                                    if (jVar.v().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                                    }
                                } catch (SQLiteException e) {
                                    z7.i0 i0Var = ((a1) jVar.f159a).f11007t;
                                    a1.f(i0Var);
                                    i0Var.f11190f.c(e, "Failed to delete a bundle in a queue table");
                                    throw e;
                                }
                            } catch (SQLiteException e4) {
                                ArrayList arrayList2 = z2Var.J;
                                if (arrayList2 == null || !arrayList2.contains(l2)) {
                                    throw e4;
                                }
                            }
                        }
                        z7.j jVar3 = z2Var.f11509c;
                        z2.D(jVar3);
                        jVar3.h();
                        z7.j jVar4 = z2Var.f11509c;
                        z2.D(jVar4);
                        jVar4.I();
                        z2Var.J = null;
                        l0Var = z2Var.f11508b;
                        z2.D(l0Var);
                        if (l0Var.s() || !z2Var.A()) {
                            z2Var.K = -1L;
                            z2Var.y();
                        } else {
                            z2Var.p();
                        }
                        z2Var.f11520z = 0L;
                    } catch (Throwable th3) {
                        z7.j jVar5 = z2Var.f11509c;
                        z2.D(jVar5);
                        jVar5.I();
                        throw th3;
                    }
                } catch (SQLiteException e10) {
                    z2Var.zzaA().f11190f.c(e10, "Database error while trying to delete uploaded bundles");
                    ((n7.b) z2Var.zzax()).getClass();
                    z2Var.f11520z = SystemClock.elapsedRealtime();
                    z2Var.zzaA().f11198y.c(Long.valueOf(z2Var.f11520z), "Disable upload, time");
                }
            } else {
                z2Var.zzaA().f11198y.d(Integer.valueOf(i), "Network upload failed. Will retry later. code, error", th);
                p0 p0Var2 = z2Var.f11514t.f11260s;
                ((n7.b) z2Var.zzax()).getClass();
                p0Var2.b(System.currentTimeMillis());
                if (i != 503 || i == 429) {
                    p0 p0Var3 = z2Var.f11514t.f11258f;
                    ((n7.b) z2Var.zzax()).getClass();
                    p0Var3.b(System.currentTimeMillis());
                }
                z7.j jVar6 = z2Var.f11509c;
                z2.D(jVar6);
                jVar6.J(arrayList);
                z2Var.y();
            }
        } else if (i == 204) {
            i = 204;
            if (th == null) {
                p0 p0Var4 = z2Var.f11514t.f11259r;
                ((n7.b) z2Var.zzax()).getClass();
                p0Var4.b(System.currentTimeMillis());
                z2Var.f11514t.f11260s.b(0L);
                z2Var.y();
                z2Var.zzaA().f11198y.d(Integer.valueOf(i), "Successful upload. Got network response. code, size", Integer.valueOf(bArr.length));
                z7.j jVar7 = z2Var.f11509c;
                z2.D(jVar7);
                jVar7.H();
                size = arrayList.size();
                i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    l2 = (Long) obj2;
                    jVar = z2Var.f11509c;
                    z2.D(jVar);
                    jLongValue = l2.longValue();
                    jVar.c();
                    jVar.d();
                    if (jVar.v().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                    }
                }
                z7.j jVar8 = z2Var.f11509c;
                z2.D(jVar8);
                jVar8.h();
                z7.j jVar9 = z2Var.f11509c;
                z2.D(jVar9);
                jVar9.I();
                z2Var.J = null;
                l0Var = z2Var.f11508b;
                z2.D(l0Var);
                if (l0Var.s()) {
                    z2Var.K = -1L;
                    z2Var.y();
                } else {
                    z2Var.K = -1L;
                    z2Var.y();
                }
                z2Var.f11520z = 0L;
            } else {
                z2Var.zzaA().f11198y.d(Integer.valueOf(i), "Network upload failed. Will retry later. code, error", th);
                p0 p0Var5 = z2Var.f11514t.f11260s;
                ((n7.b) z2Var.zzax()).getClass();
                p0Var5.b(System.currentTimeMillis());
                if (i != 503) {
                    p0 p0Var6 = z2Var.f11514t.f11258f;
                    ((n7.b) z2Var.zzax()).getClass();
                    p0Var6.b(System.currentTimeMillis());
                } else {
                    p0 p0Var7 = z2Var.f11514t.f11258f;
                    ((n7.b) z2Var.zzax()).getClass();
                    p0Var7.b(System.currentTimeMillis());
                }
                z7.j jVar10 = z2Var.f11509c;
                z2.D(jVar10);
                jVar10.J(arrayList);
                z2Var.y();
            }
        } else {
            z2Var.zzaA().f11198y.d(Integer.valueOf(i), "Network upload failed. Will retry later. code, error", th);
            p0 p0Var8 = z2Var.f11514t.f11260s;
            ((n7.b) z2Var.zzax()).getClass();
            p0Var8.b(System.currentTimeMillis());
            if (i != 503) {
                p0 p0Var9 = z2Var.f11514t.f11258f;
                ((n7.b) z2Var.zzax()).getClass();
                p0Var9.b(System.currentTimeMillis());
            } else {
                p0 p0Var10 = z2Var.f11514t.f11258f;
                ((n7.b) z2Var.zzax()).getClass();
                p0Var10.b(System.currentTimeMillis());
            }
            z7.j jVar11 = z2Var.f11509c;
            z2.D(jVar11);
            jVar11.J(arrayList);
            z2Var.y();
        }
        z2Var.E = false;
        z2Var.w();
    }

    public void c(x1.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.f7621a;
        int i = aVar.f10012a;
        if (i == 1) {
            recyclerView.f1166y.W(aVar.f10013b, aVar.f10014c);
            return;
        }
        if (i == 2) {
            recyclerView.f1166y.Z(aVar.f10013b, aVar.f10014c);
        } else if (i == 4) {
            recyclerView.f1166y.a0(aVar.f10013b, aVar.f10014c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f1166y.Y(aVar.f10013b, aVar.f10014c);
        }
    }

    public w0 d(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f7621a;
        int iH = recyclerView.f1140f.h();
        w0 w0Var = null;
        for (int i10 = 0; i10 < iH; i10++) {
            w0 w0VarM = RecyclerView.M(recyclerView.f1140f.g(i10));
            if (w0VarM != null && !w0VarM.h() && w0VarM.f10232c == i) {
                if (!recyclerView.f1140f.f10023c.contains(w0VarM.f10230a)) {
                    w0Var = w0VarM;
                    break;
                }
                w0Var = w0VarM;
            }
        }
        if (w0Var != null) {
            if (!recyclerView.f1140f.f10023c.contains(w0Var.f10230a)) {
                return w0Var;
            }
            if (RecyclerView.M0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void e(Set set) {
        Object objF;
        int[] iArr;
        jc.i.e(set, "tableIds");
        if (set.isEmpty()) {
            return;
        }
        uc.i iVar = (uc.i) this.f7621a;
        do {
            objF = iVar.f();
            int[] iArr2 = (int[]) objF;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = set.contains(Integer.valueOf(i)) ? iArr2[i] + 1 : iArr2[i];
            }
            i6.e eVar = vc.c.f9318b;
            if (objF == null) {
                objF = eVar;
            }
        } while (!iVar.g(objF, iArr));
    }

    public void f(int i, int i10) {
        int i11;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f7621a;
        int iH = recyclerView.f1140f.h();
        int i13 = i10 + i;
        for (int i14 = 0; i14 < iH; i14++) {
            View viewG = recyclerView.f1140f.g(i14);
            w0 w0VarM = RecyclerView.M(viewG);
            if (w0VarM != null && !w0VarM.o() && (i12 = w0VarM.f10232c) >= i && i12 < i13) {
                w0VarM.a(2);
                w0VarM.a(1024);
                ((x1.i0) viewG.getLayoutParams()).f10107c = true;
            }
        }
        n0 n0Var = recyclerView.f1135c;
        ArrayList arrayList = n0Var.f10156c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w0 w0Var = (w0) arrayList.get(size);
            if (w0Var != null && (i11 = w0Var.f10232c) >= i && i11 < i13) {
                w0Var.a(2);
                n0Var.g(size);
            }
        }
        recyclerView.f1163w0 = true;
    }

    @Override // q4.a
    public Object g() {
        bb.b bVar = (bb.b) this.f7621a;
        return new w3.h((g7.i) bVar.f1525c, (a2.l) bVar.f1526d);
    }

    @Override // tb.a
    public Object get() {
        String packageName = ((Context) ((tb.a) this.f7621a).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public void h(int i, int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f7621a;
        int iH = recyclerView.f1140f.h();
        for (int i11 = 0; i11 < iH; i11++) {
            w0 w0VarM = RecyclerView.M(recyclerView.f1140f.g(i11));
            if (w0VarM != null && !w0VarM.o() && w0VarM.f10232c >= i) {
                if (RecyclerView.M0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i11 + " holder " + w0VarM + " now at position " + (w0VarM.f10232c + i10));
                }
                w0VarM.l(i10, false);
                recyclerView.f1155s0.f10197f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1135c.f10156c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            w0 w0Var = (w0) arrayList.get(i12);
            if (w0Var != null && w0Var.f10232c >= i) {
                if (RecyclerView.M0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + w0Var + " now at position " + (w0Var.f10232c + i10));
                }
                w0Var.l(i10, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1161v0 = true;
    }

    public void i(int i, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.f7621a;
        int iH = recyclerView.f1140f.h();
        if (i < i10) {
            i12 = i;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i;
            i12 = i10;
            i13 = 1;
        }
        boolean z4 = false;
        for (int i19 = 0; i19 < iH; i19++) {
            w0 w0VarM = RecyclerView.M(recyclerView.f1140f.g(i19));
            if (w0VarM != null && (i18 = w0VarM.f10232c) >= i12 && i18 <= i11) {
                if (RecyclerView.M0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i19 + " holder " + w0VarM);
                }
                if (w0VarM.f10232c == i) {
                    w0VarM.l(i10 - i, false);
                } else {
                    w0VarM.l(i13, false);
                }
                recyclerView.f1155s0.f10197f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1135c.f10156c;
        if (i < i10) {
            i15 = i;
            i14 = i10;
            i16 = -1;
        } else {
            i14 = i;
            i15 = i10;
            i16 = 1;
        }
        int size = arrayList.size();
        int i20 = 0;
        while (i20 < size) {
            w0 w0Var = (w0) arrayList.get(i20);
            if (w0Var != null && (i17 = w0Var.f10232c) >= i15 && i17 <= i14) {
                if (i17 == i) {
                    w0Var.l(i10 - i, z4);
                } else {
                    w0Var.l(i16, z4);
                }
                if (RecyclerView.M0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i20 + " holder " + w0Var);
                }
            }
            i20++;
            z4 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f1161v0 = true;
    }

    public void j(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap map2 = (HashMap) this.f7621a;
            if (value == null) {
                map2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    map2.put(str, value);
                } else {
                    int i = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = t2.f.f8541b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i < zArr.length) {
                            boolArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        map2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = t2.f.f8541b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i < bArr.length) {
                            bArr2[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                        map2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = t2.f.f8541b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i < iArr.length) {
                            numArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        map2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = t2.f.f8541b;
                        Long[] lArr = new Long[jArr.length];
                        while (i < jArr.length) {
                            lArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        map2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = t2.f.f8541b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i < fArr.length) {
                            fArr2[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                        map2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = t2.f.f8541b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i < dArr.length) {
                            dArr2[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                        map2.put(str, dArr2);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdo
    public m9.a zza() {
        i iVar = (i) this.f7621a;
        return iVar.y(iVar.f7623b, null, "BANNER", null, null, new Bundle()).zzb();
    }

    public h0(z2 z2Var, String str) {
        this.f7621a = z2Var;
    }

    public h0(Context context) {
        this.f7621a = new a4.i(context, 5, false);
    }

    public h0(int i) {
        this.f7621a = new uc.i(new int[i]);
    }

    public h0(int i, boolean z4) {
        Handler handler;
        Handler handlerB;
        switch (i) {
            case 5:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handlerB = m.c.b(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e) {
                        e = e;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                    } catch (InstantiationException e4) {
                        e = e4;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                    } catch (NoSuchMethodException e10) {
                        e = e10;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                    } catch (InvocationTargetException e11) {
                        Throwable cause = e11.getCause();
                        if (!(cause instanceof RuntimeException)) {
                            if (cause instanceof Error) {
                                throw ((Error) cause);
                            }
                            throw new RuntimeException(cause);
                        }
                        throw ((RuntimeException) cause);
                    }
                    handlerB = handler;
                    break;
                }
                this.f7621a = handlerB;
                return;
            default:
                this.f7621a = new HashMap();
                return;
        }
    }
}
