package z7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzrj;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f11237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f11238d;
    public volatile Boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g2 f11239f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d6.e f11240r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f11241s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g2 f11242t;

    public k2(a1 a1Var) {
        super(a1Var);
        this.f11241s = new ArrayList();
        this.f11240r = new d6.e(a1Var.f11012y);
        this.f11237c = new j2(this);
        this.f11239f = new g2(this, a1Var, 0);
        this.f11242t = new g2(this, a1Var, 1);
    }

    public static void q(k2 k2Var, ComponentName componentName) {
        k2Var.c();
        if (k2Var.f11238d != null) {
            k2Var.f11238d = null;
            i0 i0Var = ((a1) k2Var.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11198y.c(componentName, "Disconnected from device MeasurementService");
            k2Var.c();
            k2Var.r();
        }
    }

    @Override // z7.m0
    public final boolean f() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:194:0x0306 A[Catch: all -> 0x030a, TryCatch #50 {all -> 0x030a, blocks: (B:192:0x0300, B:194:0x0306, B:197:0x030c, B:215:0x034c), top: B:290:0x0300 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x031b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0320 A[PHI: r8 r18 r19 r29
      0x0320: PHI (r8v11 android.database.sqlite.SQLiteDatabase) = (r8v10 android.database.sqlite.SQLiteDatabase), (r8v12 android.database.sqlite.SQLiteDatabase) binds: [B:200:0x031e, B:218:0x035e] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r18v4 int) = (r18v3 int), (r18v5 int) binds: [B:200:0x031e, B:218:0x035e] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r19v6 int) = (r19v5 int), (r19v7 int) binds: [B:200:0x031e, B:218:0x035e] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r29v6 z7.a1) = (r29v5 z7.a1), (r29v7 z7.a1) binds: [B:200:0x031e, B:218:0x035e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:208:0x0336  */
    /* JADX WARN: Code duplicated, block: B:210:0x033b  */
    /* JADX WARN: Code duplicated, block: B:217:0x035b  */
    /* JADX WARN: Code duplicated, block: B:222:0x036c  */
    /* JADX WARN: Code duplicated, block: B:224:0x0371  */
    /* JADX WARN: Code duplicated, block: B:229:0x038d  */
    /* JADX WARN: Code duplicated, block: B:230:0x0396  */
    /* JADX WARN: Code duplicated, block: B:237:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:243:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:249:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:255:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:271:0x03b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x03c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x03dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0300 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0361 A[SYNTHETIC] */
    public final void g(b0 b0Var, h7.a aVar, f3 f3Var) throws Throwable {
        ArrayList arrayList;
        int i;
        a1 a1Var;
        int i10;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor4;
        Cursor cursorQuery;
        long j4;
        String str;
        String[] strArr;
        c cVarCreateFromParcel;
        a3 a3VarCreateFromParcel;
        int size;
        int size2;
        int i11;
        h7.a aVar2;
        c();
        d();
        a1 a1Var2 = (a1) this.f159a;
        a1Var2.getClass();
        a1Var2.getClass();
        i0 i0Var = a1Var2.f11007t;
        int i12 = 100;
        int i13 = 100;
        int i14 = 0;
        while (i14 < 1001 && i13 == i12) {
            ArrayList arrayList2 = new ArrayList();
            d0 d0VarK = a1Var2.k();
            a1 a1Var3 = (a1) d0VarK.f159a;
            d0VarK.c();
            if (d0VarK.f11066d) {
                a1Var = a1Var2;
                i = i12;
            } else {
                arrayList = new ArrayList();
                i = i12;
                if (((a1) d0VarK.f159a).f11000a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i15 = 5;
                    int i16 = 5;
                    int i17 = 0;
                    while (true) {
                        if (i17 < i15) {
                            try {
                                SQLiteDatabase sQLiteDatabaseG = d0VarK.g();
                                if (sQLiteDatabaseG == null) {
                                    try {
                                        try {
                                            d0VarK.f11066d = true;
                                            a1Var = a1Var2;
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabaseG = sQLiteDatabaseG;
                                            sQLiteDatabase = sQLiteDatabaseG;
                                            cursor4 = null;
                                            if (cursor4 != null) {
                                                cursor4.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        a1Var = a1Var2;
                                        i14 = i14;
                                        sQLiteDatabaseG = sQLiteDatabaseG;
                                        i17 = i17;
                                        sQLiteDatabase2 = sQLiteDatabaseG;
                                        cursor3 = null;
                                        try {
                                            SystemClock.sleep(i16);
                                            i16 += 20;
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                            if (sQLiteDatabase2 != null) {
                                                sQLiteDatabase2.close();
                                            }
                                            i17++;
                                            i14 = i14;
                                            a1Var2 = a1Var;
                                            i15 = 5;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor4 = cursor3;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            if (cursor4 != null) {
                                                cursor4.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        a1Var = a1Var2;
                                        i14 = i14;
                                        sQLiteDatabaseG = sQLiteDatabaseG;
                                        i17 = i17;
                                        sQLiteDatabase = sQLiteDatabaseG;
                                        cursor2 = null;
                                        i0 i0Var2 = a1Var3.f11007t;
                                        a1.f(i0Var2);
                                        i0Var2.f11190f.c(e, "Error reading entries from local database");
                                        d0VarK.f11066d = true;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i17++;
                                        i14 = i14;
                                        a1Var2 = a1Var;
                                        i15 = 5;
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        a1Var = a1Var2;
                                        i14 = i14;
                                        sQLiteDatabaseG = sQLiteDatabaseG;
                                        i17 = i17;
                                        sQLiteDatabase = sQLiteDatabaseG;
                                        cursor = null;
                                        if (sQLiteDatabase != null) {
                                            try {
                                                if (sQLiteDatabase.inTransaction()) {
                                                    sQLiteDatabase.endTransaction();
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cursor4 = cursor;
                                                if (cursor4 != null) {
                                                    cursor4.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                throw th;
                                            }
                                        }
                                        i0 i0Var3 = a1Var3.f11007t;
                                        a1.f(i0Var3);
                                        i0Var3.f11190f.c(e, "Error reading entries from local database");
                                        d0VarK.f11066d = true;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i17++;
                                        i14 = i14;
                                        a1Var2 = a1Var;
                                        i15 = 5;
                                    }
                                } else {
                                    sQLiteDatabaseG.beginTransaction();
                                    try {
                                        cursorQuery = sQLiteDatabaseG.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j10 = -1;
                                            if (cursorQuery.moveToFirst()) {
                                                a1Var = a1Var2;
                                                try {
                                                    j4 = cursorQuery.getLong(0);
                                                    try {
                                                        cursorQuery.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        i14 = i14;
                                                        sQLiteDatabaseG = sQLiteDatabaseG;
                                                        i17 = i17;
                                                        sQLiteDatabase2 = sQLiteDatabaseG;
                                                        cursor3 = null;
                                                        SystemClock.sleep(i16);
                                                        i16 += 20;
                                                        if (cursor3 != null) {
                                                            cursor3.close();
                                                        }
                                                        if (sQLiteDatabase2 != null) {
                                                            sQLiteDatabase2.close();
                                                        }
                                                        i17++;
                                                        i14 = i14;
                                                        a1Var2 = a1Var;
                                                        i15 = 5;
                                                    } catch (SQLiteFullException e10) {
                                                        e = e10;
                                                        i14 = i14;
                                                        sQLiteDatabaseG = sQLiteDatabaseG;
                                                        i17 = i17;
                                                        sQLiteDatabase = sQLiteDatabaseG;
                                                        cursor2 = null;
                                                        i0 i0Var4 = a1Var3.f11007t;
                                                        a1.f(i0Var4);
                                                        i0Var4.f11190f.c(e, "Error reading entries from local database");
                                                        d0VarK.f11066d = true;
                                                        if (cursor2 != null) {
                                                            cursor2.close();
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                            sQLiteDatabase.close();
                                                        }
                                                        i17++;
                                                        i14 = i14;
                                                        a1Var2 = a1Var;
                                                        i15 = 5;
                                                    } catch (SQLiteException e11) {
                                                        e = e11;
                                                        i14 = i14;
                                                        sQLiteDatabaseG = sQLiteDatabaseG;
                                                        i17 = i17;
                                                        sQLiteDatabase = sQLiteDatabaseG;
                                                        cursor = null;
                                                        if (sQLiteDatabase != null) {
                                                            if (sQLiteDatabase.inTransaction()) {
                                                                sQLiteDatabase.endTransaction();
                                                            }
                                                        }
                                                        i0 i0Var5 = a1Var3.f11007t;
                                                        a1.f(i0Var5);
                                                        i0Var5.f11190f.c(e, "Error reading entries from local database");
                                                        d0VarK.f11066d = true;
                                                        if (cursor != null) {
                                                            cursor.close();
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                            sQLiteDatabase.close();
                                                        }
                                                        i17++;
                                                        i14 = i14;
                                                        a1Var2 = a1Var;
                                                        i15 = 5;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    if (cursorQuery != null) {
                                                        try {
                                                            cursorQuery.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            sQLiteDatabase2 = sQLiteDatabaseG;
                                                            cursor3 = null;
                                                            SystemClock.sleep(i16);
                                                            i16 += 20;
                                                            if (cursor3 != null) {
                                                                cursor3.close();
                                                            }
                                                            if (sQLiteDatabase2 != null) {
                                                                sQLiteDatabase2.close();
                                                            }
                                                            i17++;
                                                            i14 = i14;
                                                            a1Var2 = a1Var;
                                                            i15 = 5;
                                                        } catch (SQLiteFullException e12) {
                                                            e = e12;
                                                            sQLiteDatabase = sQLiteDatabaseG;
                                                            cursor2 = null;
                                                            i0 i0Var6 = a1Var3.f11007t;
                                                            a1.f(i0Var6);
                                                            i0Var6.f11190f.c(e, "Error reading entries from local database");
                                                            d0VarK.f11066d = true;
                                                            if (cursor2 != null) {
                                                                cursor2.close();
                                                            }
                                                            if (sQLiteDatabase != null) {
                                                                sQLiteDatabase.close();
                                                            }
                                                            i17++;
                                                            i14 = i14;
                                                            a1Var2 = a1Var;
                                                            i15 = 5;
                                                        } catch (SQLiteException e13) {
                                                            e = e13;
                                                            sQLiteDatabase = sQLiteDatabaseG;
                                                            cursor = null;
                                                            if (sQLiteDatabase != null) {
                                                                if (sQLiteDatabase.inTransaction()) {
                                                                    sQLiteDatabase.endTransaction();
                                                                }
                                                            }
                                                            i0 i0Var7 = a1Var3.f11007t;
                                                            a1.f(i0Var7);
                                                            i0Var7.f11190f.c(e, "Error reading entries from local database");
                                                            d0VarK.f11066d = true;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabase != null) {
                                                                sQLiteDatabase.close();
                                                            }
                                                            i17++;
                                                            i14 = i14;
                                                            a1Var2 = a1Var;
                                                            i15 = 5;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            sQLiteDatabase = sQLiteDatabaseG;
                                                            cursor4 = null;
                                                            if (cursor4 != null) {
                                                                cursor4.close();
                                                            }
                                                            if (sQLiteDatabase != null) {
                                                                sQLiteDatabase.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                a1Var = a1Var2;
                                                cursorQuery.close();
                                                j4 = -1;
                                            }
                                            if (j4 != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j4)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            try {
                                                Cursor cursorQuery2 = sQLiteDatabaseG.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(i));
                                                sQLiteDatabase = sQLiteDatabaseG;
                                                while (cursorQuery2.moveToNext()) {
                                                    try {
                                                        try {
                                                            i17 = i17;
                                                            try {
                                                                j10 = cursorQuery2.getLong(0);
                                                                try {
                                                                    int i18 = cursorQuery2.getInt(1);
                                                                    i14 = i14;
                                                                    try {
                                                                        byte[] blob = cursorQuery2.getBlob(2);
                                                                        if (i18 == 0) {
                                                                            Parcel parcelObtain = Parcel.obtain();
                                                                            try {
                                                                                cursorQuery2 = cursorQuery2;
                                                                                try {
                                                                                    try {
                                                                                        parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                        parcelObtain.setDataPosition(0);
                                                                                        q qVarCreateFromParcel = q.CREATOR.createFromParcel(parcelObtain);
                                                                                        try {
                                                                                            try {
                                                                                                parcelObtain.recycle();
                                                                                                if (qVarCreateFromParcel != null) {
                                                                                                    arrayList.add(qVarCreateFromParcel);
                                                                                                }
                                                                                            } catch (Throwable th6) {
                                                                                                th = th6;
                                                                                                cursor4 = cursorQuery2;
                                                                                                if (cursor4 != null) {
                                                                                                    cursor4.close();
                                                                                                }
                                                                                                if (sQLiteDatabase != null) {
                                                                                                    sQLiteDatabase.close();
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (SQLiteDatabaseLockedException unused4) {
                                                                                            sQLiteDatabase2 = sQLiteDatabase;
                                                                                            cursor3 = cursorQuery2;
                                                                                            SystemClock.sleep(i16);
                                                                                            i16 += 20;
                                                                                            if (cursor3 != null) {
                                                                                                cursor3.close();
                                                                                            }
                                                                                            if (sQLiteDatabase2 != null) {
                                                                                                sQLiteDatabase2.close();
                                                                                            }
                                                                                            i17++;
                                                                                            i14 = i14;
                                                                                            a1Var2 = a1Var;
                                                                                            i15 = 5;
                                                                                        } catch (SQLiteFullException e14) {
                                                                                            e = e14;
                                                                                            cursor2 = cursorQuery2;
                                                                                            i0 i0Var8 = a1Var3.f11007t;
                                                                                            a1.f(i0Var8);
                                                                                            i0Var8.f11190f.c(e, "Error reading entries from local database");
                                                                                            d0VarK.f11066d = true;
                                                                                            if (cursor2 != null) {
                                                                                                cursor2.close();
                                                                                            }
                                                                                            if (sQLiteDatabase != null) {
                                                                                                sQLiteDatabase.close();
                                                                                            }
                                                                                            i17++;
                                                                                            i14 = i14;
                                                                                            a1Var2 = a1Var;
                                                                                            i15 = 5;
                                                                                        } catch (SQLiteException e15) {
                                                                                            e = e15;
                                                                                            cursor = cursorQuery2;
                                                                                            if (sQLiteDatabase != null) {
                                                                                                if (sQLiteDatabase.inTransaction()) {
                                                                                                    sQLiteDatabase.endTransaction();
                                                                                                }
                                                                                            }
                                                                                            i0 i0Var9 = a1Var3.f11007t;
                                                                                            a1.f(i0Var9);
                                                                                            i0Var9.f11190f.c(e, "Error reading entries from local database");
                                                                                            d0VarK.f11066d = true;
                                                                                            if (cursor != null) {
                                                                                                cursor.close();
                                                                                            }
                                                                                            if (sQLiteDatabase != null) {
                                                                                                sQLiteDatabase.close();
                                                                                            }
                                                                                            i17++;
                                                                                            i14 = i14;
                                                                                            a1Var2 = a1Var;
                                                                                            i15 = 5;
                                                                                        }
                                                                                    } catch (h7.b unused5) {
                                                                                        i0 i0Var10 = a1Var3.f11007t;
                                                                                        a1.f(i0Var10);
                                                                                        i0Var10.f11190f.b("Failed to load event from local database");
                                                                                        parcelObtain.recycle();
                                                                                    }
                                                                                } catch (Throwable th7) {
                                                                                    th = th7;
                                                                                    parcelObtain.recycle();
                                                                                    throw th;
                                                                                }
                                                                            } catch (h7.b unused6) {
                                                                                cursorQuery2 = cursorQuery2;
                                                                            } catch (Throwable th8) {
                                                                                th = th8;
                                                                            }
                                                                        } else {
                                                                            cursorQuery2 = cursorQuery2;
                                                                            if (i18 == 1) {
                                                                                Parcel parcelObtain2 = Parcel.obtain();
                                                                                try {
                                                                                    try {
                                                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                        parcelObtain2.setDataPosition(0);
                                                                                        a3VarCreateFromParcel = a3.CREATOR.createFromParcel(parcelObtain2);
                                                                                        parcelObtain2.recycle();
                                                                                    } catch (Throwable th9) {
                                                                                        parcelObtain2.recycle();
                                                                                        throw th9;
                                                                                    }
                                                                                } catch (h7.b unused7) {
                                                                                    i0 i0Var11 = a1Var3.f11007t;
                                                                                    a1.f(i0Var11);
                                                                                    i0Var11.f11190f.b("Failed to load user property from local database");
                                                                                    parcelObtain2.recycle();
                                                                                    a3VarCreateFromParcel = null;
                                                                                }
                                                                                if (a3VarCreateFromParcel != null) {
                                                                                    arrayList.add(a3VarCreateFromParcel);
                                                                                }
                                                                            } else if (i18 == 2) {
                                                                                Parcel parcelObtain3 = Parcel.obtain();
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                            parcelObtain3.setDataPosition(0);
                                                                                            cVarCreateFromParcel = c.CREATOR.createFromParcel(parcelObtain3);
                                                                                            try {
                                                                                                parcelObtain3.recycle();
                                                                                                if (cVarCreateFromParcel != null) {
                                                                                                    arrayList.add(cVarCreateFromParcel);
                                                                                                }
                                                                                            } catch (SQLiteDatabaseLockedException unused8) {
                                                                                                sQLiteDatabase2 = sQLiteDatabase;
                                                                                                cursor3 = cursorQuery2;
                                                                                                SystemClock.sleep(i16);
                                                                                                i16 += 20;
                                                                                                if (cursor3 != null) {
                                                                                                    cursor3.close();
                                                                                                }
                                                                                                if (sQLiteDatabase2 != null) {
                                                                                                    sQLiteDatabase2.close();
                                                                                                }
                                                                                                i17++;
                                                                                                i14 = i14;
                                                                                                a1Var2 = a1Var;
                                                                                                i15 = 5;
                                                                                            } catch (SQLiteFullException e16) {
                                                                                                e = e16;
                                                                                                cursor2 = cursorQuery2;
                                                                                                i0 i0Var12 = a1Var3.f11007t;
                                                                                                a1.f(i0Var12);
                                                                                                i0Var12.f11190f.c(e, "Error reading entries from local database");
                                                                                                d0VarK.f11066d = true;
                                                                                                if (cursor2 != null) {
                                                                                                    cursor2.close();
                                                                                                }
                                                                                                if (sQLiteDatabase != null) {
                                                                                                    sQLiteDatabase.close();
                                                                                                }
                                                                                                i17++;
                                                                                                i14 = i14;
                                                                                                a1Var2 = a1Var;
                                                                                                i15 = 5;
                                                                                            } catch (SQLiteException e17) {
                                                                                                e = e17;
                                                                                                cursor = cursorQuery2;
                                                                                                if (sQLiteDatabase != null) {
                                                                                                    if (sQLiteDatabase.inTransaction()) {
                                                                                                        sQLiteDatabase.endTransaction();
                                                                                                    }
                                                                                                }
                                                                                                i0 i0Var13 = a1Var3.f11007t;
                                                                                                a1.f(i0Var13);
                                                                                                i0Var13.f11190f.c(e, "Error reading entries from local database");
                                                                                                d0VarK.f11066d = true;
                                                                                                if (cursor != null) {
                                                                                                    cursor.close();
                                                                                                }
                                                                                                if (sQLiteDatabase != null) {
                                                                                                    sQLiteDatabase.close();
                                                                                                }
                                                                                                i17++;
                                                                                                i14 = i14;
                                                                                                a1Var2 = a1Var;
                                                                                                i15 = 5;
                                                                                            }
                                                                                        } catch (h7.b unused9) {
                                                                                            i0 i0Var14 = a1Var3.f11007t;
                                                                                            a1.f(i0Var14);
                                                                                            i0Var14.f11190f.b("Failed to load conditional user property from local database");
                                                                                            parcelObtain3.recycle();
                                                                                            cVarCreateFromParcel = null;
                                                                                        }
                                                                                    } catch (Throwable th10) {
                                                                                        th = th10;
                                                                                        parcelObtain3.recycle();
                                                                                        throw th;
                                                                                    }
                                                                                } catch (h7.b unused10) {
                                                                                } catch (Throwable th11) {
                                                                                    th = th11;
                                                                                }
                                                                            } else if (i18 == 3) {
                                                                                i0 i0Var15 = a1Var3.f11007t;
                                                                                a1.f(i0Var15);
                                                                                i0Var15.f11193t.b("Skipping app launch break");
                                                                            } else {
                                                                                i0 i0Var16 = a1Var3.f11007t;
                                                                                a1.f(i0Var16);
                                                                                i0Var16.f11190f.b("Unknown record type in local database");
                                                                            }
                                                                            i17 = i17;
                                                                            i14 = i14;
                                                                            cursorQuery2 = cursorQuery2;
                                                                        }
                                                                        i17 = i17;
                                                                        i14 = i14;
                                                                        cursorQuery2 = cursorQuery2;
                                                                    } catch (SQLiteDatabaseLockedException unused11) {
                                                                        cursorQuery2 = cursorQuery2;
                                                                    } catch (SQLiteFullException e18) {
                                                                        e = e18;
                                                                        cursorQuery2 = cursorQuery2;
                                                                    } catch (SQLiteException e19) {
                                                                        e = e19;
                                                                        cursorQuery2 = cursorQuery2;
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused12) {
                                                                    i14 = i14;
                                                                    sQLiteDatabase2 = sQLiteDatabase;
                                                                    cursor3 = cursorQuery2;
                                                                    SystemClock.sleep(i16);
                                                                    i16 += 20;
                                                                    if (cursor3 != null) {
                                                                        cursor3.close();
                                                                    }
                                                                    if (sQLiteDatabase2 != null) {
                                                                        sQLiteDatabase2.close();
                                                                    }
                                                                    i17++;
                                                                    i14 = i14;
                                                                    a1Var2 = a1Var;
                                                                    i15 = 5;
                                                                } catch (SQLiteFullException e20) {
                                                                    e = e20;
                                                                    i14 = i14;
                                                                    cursor2 = cursorQuery2;
                                                                    i0 i0Var17 = a1Var3.f11007t;
                                                                    a1.f(i0Var17);
                                                                    i0Var17.f11190f.c(e, "Error reading entries from local database");
                                                                    d0VarK.f11066d = true;
                                                                    if (cursor2 != null) {
                                                                        cursor2.close();
                                                                    }
                                                                    if (sQLiteDatabase != null) {
                                                                        sQLiteDatabase.close();
                                                                    }
                                                                    i17++;
                                                                    i14 = i14;
                                                                    a1Var2 = a1Var;
                                                                    i15 = 5;
                                                                } catch (SQLiteException e21) {
                                                                    e = e21;
                                                                    i14 = i14;
                                                                    cursor = cursorQuery2;
                                                                    if (sQLiteDatabase != null) {
                                                                        if (sQLiteDatabase.inTransaction()) {
                                                                            sQLiteDatabase.endTransaction();
                                                                        }
                                                                    }
                                                                    i0 i0Var18 = a1Var3.f11007t;
                                                                    a1.f(i0Var18);
                                                                    i0Var18.f11190f.c(e, "Error reading entries from local database");
                                                                    d0VarK.f11066d = true;
                                                                    if (cursor != null) {
                                                                        cursor.close();
                                                                    }
                                                                    if (sQLiteDatabase != null) {
                                                                        sQLiteDatabase.close();
                                                                    }
                                                                    i17++;
                                                                    i14 = i14;
                                                                    a1Var2 = a1Var;
                                                                    i15 = 5;
                                                                }
                                                            } catch (SQLiteDatabaseLockedException unused13) {
                                                                cursorQuery2 = cursorQuery2;
                                                                i14 = i14;
                                                            } catch (SQLiteFullException e22) {
                                                                e = e22;
                                                                cursorQuery2 = cursorQuery2;
                                                                i14 = i14;
                                                            } catch (SQLiteException e23) {
                                                                e = e23;
                                                                cursorQuery2 = cursorQuery2;
                                                                i14 = i14;
                                                            }
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                            cursorQuery2 = cursorQuery2;
                                                        }
                                                    } catch (SQLiteDatabaseLockedException unused14) {
                                                        i17 = i17;
                                                    } catch (SQLiteFullException e24) {
                                                        e = e24;
                                                        i17 = i17;
                                                    } catch (SQLiteException e25) {
                                                        e = e25;
                                                        i17 = i17;
                                                    }
                                                }
                                                Cursor cursor5 = cursorQuery2;
                                                i10 = i14;
                                                if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j10)}) < arrayList.size()) {
                                                    i0 i0Var19 = a1Var3.f11007t;
                                                    a1.f(i0Var19);
                                                    i0Var19.f11190f.b("Fewer entries removed from local database than expected");
                                                }
                                                sQLiteDatabase.setTransactionSuccessful();
                                                sQLiteDatabase.endTransaction();
                                                cursor5.close();
                                                sQLiteDatabase.close();
                                            } catch (SQLiteDatabaseLockedException unused15) {
                                                i14 = i14;
                                                i17 = i17;
                                                sQLiteDatabaseG = sQLiteDatabaseG;
                                                sQLiteDatabase2 = sQLiteDatabaseG;
                                                cursor3 = null;
                                                SystemClock.sleep(i16);
                                                i16 += 20;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                if (sQLiteDatabase2 != null) {
                                                    sQLiteDatabase2.close();
                                                }
                                                i17++;
                                                i14 = i14;
                                                a1Var2 = a1Var;
                                                i15 = 5;
                                            } catch (SQLiteFullException e26) {
                                                e = e26;
                                                i14 = i14;
                                                i17 = i17;
                                                sQLiteDatabaseG = sQLiteDatabaseG;
                                                sQLiteDatabase = sQLiteDatabaseG;
                                                cursor2 = null;
                                                i0 i0Var110 = a1Var3.f11007t;
                                                a1.f(i0Var110);
                                                i0Var110.f11190f.c(e, "Error reading entries from local database");
                                                d0VarK.f11066d = true;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                i17++;
                                                i14 = i14;
                                                a1Var2 = a1Var;
                                                i15 = 5;
                                            } catch (SQLiteException e27) {
                                                e = e27;
                                                i14 = i14;
                                                i17 = i17;
                                                sQLiteDatabaseG = sQLiteDatabaseG;
                                                sQLiteDatabase = sQLiteDatabaseG;
                                                cursor = null;
                                                if (sQLiteDatabase != null) {
                                                    if (sQLiteDatabase.inTransaction()) {
                                                        sQLiteDatabase.endTransaction();
                                                    }
                                                }
                                                i0 i0Var111 = a1Var3.f11007t;
                                                a1.f(i0Var111);
                                                i0Var111.f11190f.c(e, "Error reading entries from local database");
                                                d0VarK.f11066d = true;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                i17++;
                                                i14 = i14;
                                                a1Var2 = a1Var;
                                                i15 = 5;
                                            } catch (Throwable th13) {
                                                th = th13;
                                                sQLiteDatabaseG = sQLiteDatabaseG;
                                                sQLiteDatabase = sQLiteDatabaseG;
                                                cursor4 = null;
                                                if (cursor4 != null) {
                                                    cursor4.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th14) {
                                            th = th14;
                                            a1Var = a1Var2;
                                        }
                                    } catch (Throwable th15) {
                                        th = th15;
                                        a1Var = a1Var2;
                                        cursorQuery = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused16) {
                                a1Var = a1Var2;
                                i17 = i17;
                                i14 = i14;
                                cursor3 = null;
                                sQLiteDatabase2 = null;
                            } catch (SQLiteFullException e28) {
                                e = e28;
                                a1Var = a1Var2;
                                i17 = i17;
                                i14 = i14;
                                cursor2 = null;
                                sQLiteDatabase = null;
                            } catch (SQLiteException e29) {
                                e = e29;
                                a1Var = a1Var2;
                                i17 = i17;
                                i14 = i14;
                                cursor = null;
                                sQLiteDatabase = null;
                            } catch (Throwable th16) {
                                th = th16;
                                sQLiteDatabase = null;
                            }
                        } else {
                            a1Var = a1Var2;
                            i10 = i14;
                            i0 i0Var20 = a1Var3.f11007t;
                            a1.f(i0Var20);
                            i0Var20.f11193t.b("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i17++;
                        i14 = i14;
                        a1Var2 = a1Var;
                        i15 = 5;
                    }
                } else {
                    a1Var = a1Var2;
                    i10 = i14;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = 0;
                }
                int i19 = i;
                if (aVar != null && size < i19) {
                    arrayList2.add(aVar);
                }
                size2 = arrayList2.size();
                for (i11 = 0; i11 < size2; i11++) {
                    aVar2 = (h7.a) arrayList2.get(i11);
                    if (aVar2 instanceof q) {
                        try {
                            b0Var.r((q) aVar2, f3Var);
                        } catch (RemoteException e30) {
                            a1.f(i0Var);
                            i0Var.f11190f.c(e30, "Failed to send event to the service");
                        }
                    } else if (aVar2 instanceof a3) {
                        try {
                            b0Var.j((a3) aVar2, f3Var);
                        } catch (RemoteException e31) {
                            a1.f(i0Var);
                            i0Var.f11190f.c(e31, "Failed to send user property to the service");
                        }
                    } else if (aVar2 instanceof c) {
                        try {
                            b0Var.z((c) aVar2, f3Var);
                        } catch (RemoteException e32) {
                            a1.f(i0Var);
                            i0Var.f11190f.c(e32, "Failed to send conditional user property to the service");
                        }
                    } else {
                        a1.f(i0Var);
                        i0Var.f11190f.b("Discarding data. Unrecognized parcel type.");
                    }
                }
                i14 = i10 + 1;
                i13 = size;
                i12 = i19;
                a1Var2 = a1Var;
            }
            i10 = i14;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = 0;
            }
            int i110 = i;
            if (aVar != null) {
                arrayList2.add(aVar);
            }
            size2 = arrayList2.size();
            while (i11 < size2) {
                aVar2 = (h7.a) arrayList2.get(i11);
                if (aVar2 instanceof q) {
                    b0Var.r((q) aVar2, f3Var);
                } else if (aVar2 instanceof a3) {
                    b0Var.j((a3) aVar2, f3Var);
                } else if (aVar2 instanceof c) {
                    b0Var.z((c) aVar2, f3Var);
                } else {
                    a1.f(i0Var);
                    i0Var.f11190f.b("Discarding data. Unrecognized parcel type.");
                }
            }
            i14 = i10 + 1;
            i13 = size;
            i12 = i110;
            a1Var2 = a1Var;
        }
    }

    public final void h(c cVar) {
        boolean zK;
        c();
        d();
        a1 a1Var = (a1) this.f159a;
        a1Var.getClass();
        d0 d0VarK = a1Var.k();
        a1 a1Var2 = (a1) d0VarK.f159a;
        a1.d(a1Var2.f11010w);
        byte[] bArrS = d3.S(cVar);
        if (bArrS.length > 131072) {
            i0 i0Var = a1Var2.f11007t;
            a1.f(i0Var);
            i0Var.f11191r.b("Conditional user property too long for local database. Sending directly to service");
            zK = false;
        } else {
            zK = d0VarK.k(2, bArrS);
        }
        boolean z4 = zK;
        p(new f7.f(this, m(true), z4, new c(cVar), 3));
    }

    public final boolean j() {
        c();
        d();
        return this.f11238d != null;
    }

    public final boolean k() {
        c();
        d();
        if (!l()) {
            return true;
        }
        d3 d3Var = ((a1) this.f159a).f11010w;
        a1.d(d3Var);
        return d3Var.c0() >= ((Integer) z.f11457f0.a(null)).intValue();
    }

    public final boolean l() {
        c();
        d();
        if (this.e == null) {
            c();
            d();
            q0 q0Var = ((a1) this.f159a).f11006s;
            a1.d(q0Var);
            q0Var.c();
            boolean z4 = false;
            Boolean boolValueOf = !q0Var.g().contains("use_service") ? null : Boolean.valueOf(q0Var.g().getBoolean("use_service", false));
            boolean z10 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                ((a1) this.f159a).getClass();
                c0 c0VarJ = ((a1) this.f159a).j();
                c0VarJ.d();
                if (c0VarJ.f11054v == 1) {
                    z4 = true;
                } else {
                    i0 i0Var = ((a1) this.f159a).f11007t;
                    a1.f(i0Var);
                    i0Var.f11198y.b("Checking service availability");
                    d3 d3Var = ((a1) this.f159a).f11010w;
                    a1.d(d3Var);
                    int iD = g7.f.f4241b.d(((a1) d3Var.f159a).f11000a, 12451000);
                    if (iD == 0) {
                        i0 i0Var2 = ((a1) this.f159a).f11007t;
                        a1.f(i0Var2);
                        i0Var2.f11198y.b("Service available");
                    } else if (iD == 1) {
                        i0 i0Var3 = ((a1) this.f159a).f11007t;
                        a1.f(i0Var3);
                        i0Var3.f11198y.b("Service missing");
                    } else if (iD != 2) {
                        if (iD == 3) {
                            i0 i0Var4 = ((a1) this.f159a).f11007t;
                            a1.f(i0Var4);
                            i0Var4.f11193t.b("Service disabled");
                        } else if (iD == 9) {
                            i0 i0Var5 = ((a1) this.f159a).f11007t;
                            a1.f(i0Var5);
                            i0Var5.f11193t.b("Service invalid");
                        } else if (iD != 18) {
                            i0 i0Var6 = ((a1) this.f159a).f11007t;
                            a1.f(i0Var6);
                            i0Var6.f11193t.c(Integer.valueOf(iD), "Unexpected service status");
                        } else {
                            i0 i0Var7 = ((a1) this.f159a).f11007t;
                            a1.f(i0Var7);
                            i0Var7.f11193t.b("Service updating");
                        }
                        z10 = false;
                    } else {
                        i0 i0Var8 = ((a1) this.f159a).f11007t;
                        a1.f(i0Var8);
                        i0Var8.f11197x.b("Service container out of date");
                        d3 d3Var2 = ((a1) this.f159a).f11010w;
                        a1.d(d3Var2);
                        if (d3Var2.c0() >= 17443) {
                            z4 = boolValueOf == null;
                            z10 = false;
                        }
                    }
                    z4 = true;
                }
                if (!z4 && ((a1) this.f159a).f11005r.p()) {
                    i0 i0Var9 = ((a1) this.f159a).f11007t;
                    a1.f(i0Var9);
                    i0Var9.f11190f.b("No way to upload. Consider using the full version of Analytics");
                } else if (z10) {
                    q0 q0Var2 = ((a1) this.f159a).f11006s;
                    a1.d(q0Var2);
                    q0Var2.c();
                    SharedPreferences.Editor editorEdit = q0Var2.g().edit();
                    editorEdit.putBoolean("use_service", z4);
                    editorEdit.apply();
                }
                z10 = z4;
            }
            this.e = Boolean.valueOf(z10);
        }
        return this.e.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0287  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:104:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:119:0x0313  */
    /* JADX WARN: Code duplicated, block: B:121:0x0321  */
    /* JADX WARN: Code duplicated, block: B:124:0x0332  */
    /* JADX WARN: Code duplicated, block: B:125:0x0334  */
    /* JADX WARN: Code duplicated, block: B:128:0x0344  */
    /* JADX WARN: Code duplicated, block: B:135:0x0365 A[Catch: NameNotFoundException -> 0x036a, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x036a, blocks: (B:133:0x035f, B:135:0x0365), top: B:145:0x035f }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0358 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x01e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x020c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:6:0x0024  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x0209  */
    /* JADX WARN: Code duplicated, block: B:88:0x0245  */
    /* JADX WARN: Code duplicated, block: B:95:0x0262  */
    /* JADX WARN: Code duplicated, block: B:98:0x0284  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public final f3 m(boolean z4) {
        String strU;
        Context context;
        String str;
        boolean z10;
        long j4;
        long j10;
        Class<?> clsLoadClass;
        boolean z11;
        long j11;
        Object objInvoke;
        String str2;
        long jMin;
        long jA;
        Boolean boolK;
        boolean z12;
        Boolean boolK2;
        Boolean boolValueOf;
        String str3;
        Boolean boolK3;
        boolean zBooleanValue;
        a1 a1Var;
        String strG;
        int i;
        ApplicationInfo applicationInfoD;
        long jAbs;
        Pair pair;
        a1 a1Var2 = (a1) this.f159a;
        a1Var2.getClass();
        c0 c0VarJ = a1Var2.j();
        if (z4) {
            i0 i0Var = a1Var2.f11007t;
            a1.f(i0Var);
            a1 a1Var3 = (a1) i0Var.f159a;
            q0 q0Var = a1Var3.f11006s;
            a1.d(q0Var);
            if (q0Var.f11307d == null) {
                strU = null;
            } else {
                q0 q0Var2 = a1Var3.f11006s;
                a1.d(q0Var2);
                kb.d dVar = q0Var2.f11307d;
                q0 q0Var3 = (q0) dVar.e;
                q0Var3.c();
                q0Var3.c();
                long j12 = ((q0) dVar.e).g().getLong((String) dVar.f6152b, 0L);
                if (j12 == 0) {
                    dVar.d();
                    jAbs = 0;
                } else {
                    ((a1) q0Var3.f159a).f11012y.getClass();
                    jAbs = Math.abs(j12 - System.currentTimeMillis());
                }
                long j13 = dVar.f6151a;
                if (jAbs < j13) {
                    pair = null;
                } else if (jAbs > j13 + j13) {
                    dVar.d();
                    pair = null;
                } else {
                    String string = q0Var3.g().getString((String) dVar.f6154d, null);
                    long j14 = q0Var3.g().getLong((String) dVar.f6153c, 0L);
                    dVar.d();
                    pair = (string == null || j14 <= 0) ? q0.I : new Pair(string, Long.valueOf(j14));
                }
                if (pair == null || pair == q0.I) {
                    strU = null;
                } else {
                    strU = da.v.u(String.valueOf(pair.second), ":", (String) pair.first);
                }
            }
        } else {
            strU = null;
        }
        c0VarJ.c();
        String strG2 = c0VarJ.g();
        String strH = c0VarJ.h();
        c0VarJ.d();
        String str4 = c0VarJ.f11048d;
        c0VarJ.d();
        long j15 = c0VarJ.e;
        c0VarJ.d();
        com.google.android.gms.common.internal.i0.i(c0VarJ.f11049f);
        String str5 = c0VarJ.f11049f;
        a1 a1Var4 = (a1) c0VarJ.f159a;
        g gVar = a1Var4.f11005r;
        i0 i0Var2 = a1Var4.f11007t;
        Context context2 = a1Var4.f11000a;
        d3 d3Var = a1Var4.f11010w;
        q0 q0Var4 = a1Var4.f11006s;
        gVar.g();
        c0VarJ.d();
        c0VarJ.c();
        long j16 = c0VarJ.f11050r;
        if (j16 == 0) {
            a1.d(d3Var);
            z10 = false;
            a1 a1Var5 = (a1) d3Var.f159a;
            String packageName = context2.getPackageName();
            d3Var.c();
            com.google.android.gms.common.internal.i0.e(packageName);
            PackageManager packageManager = context2.getPackageManager();
            MessageDigest messageDigestK = d3.k();
            long jD0 = -1;
            if (messageDigestK == null) {
                i0 i0Var3 = a1Var5.f11007t;
                a1.f(i0Var3);
                i0Var3.f11190f.b("Could not get MD5 instance");
                context = context2;
                str = strG2;
            } else {
                if (packageManager != null) {
                    try {
                        if (d3Var.M(context2, packageName)) {
                            context = context2;
                            str = strG2;
                            jD0 = 0;
                        } else {
                            context = context2;
                            try {
                                str = strG2;
                                try {
                                    Signature[] signatureArr = p7.c.a(context2).f(64, a1Var5.f11000a.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        i0 i0Var4 = a1Var5.f11007t;
                                        a1.f(i0Var4);
                                        i0Var4.f11193t.b("Could not get signatures");
                                    } else {
                                        jD0 = d3.d0(messageDigestK.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    i0 i0Var5 = a1Var5.f11007t;
                                    a1.f(i0Var5);
                                    i0Var5.f11190f.c(e, "Package name not found");
                                    j4 = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e4) {
                                e = e4;
                                str = strG2;
                                i0 i0Var6 = a1Var5.f11007t;
                                a1.f(i0Var6);
                                i0Var6.f11190f.c(e, "Package name not found");
                                j4 = 0;
                                c0VarJ.f11050r = j4;
                                boolean zB = a1Var4.b();
                                a1.d(q0Var4);
                                j10 = 0;
                                boolean z13 = !q0Var4.A;
                                c0VarJ.c();
                                if (a1Var4.b()) {
                                    zzrj.zzc();
                                    if (gVar.l(null, z.f11450b0)) {
                                        a1.f(i0Var2);
                                        i0Var2.f11198y.b("Disabled IID for tests.");
                                    } else {
                                        try {
                                            clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                                            if (clsLoadClass == null) {
                                                z11 = true;
                                                try {
                                                    j11 = j4;
                                                    try {
                                                        objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                                                        if (objInvoke == null) {
                                                            str2 = null;
                                                        } else {
                                                            try {
                                                                str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                            } catch (Exception unused) {
                                                                a1.f(i0Var2);
                                                                i0Var2.f11195v.b("Failed to retrieve Firebase Instance Id");
                                                                str2 = null;
                                                            }
                                                        }
                                                    } catch (Exception unused2) {
                                                        a1.f(i0Var2);
                                                        i0Var2.f11194u.b("Failed to obtain Firebase Analytics instance");
                                                    }
                                                } catch (Exception unused3) {
                                                    j11 = j4;
                                                }
                                            }
                                        } catch (ClassNotFoundException unused4) {
                                        }
                                        str2 = null;
                                    }
                                    j11 = j4;
                                    z11 = true;
                                    str2 = null;
                                } else {
                                    j11 = j4;
                                    z11 = true;
                                    str2 = null;
                                }
                                jMin = a1Var4.R;
                                jA = q0Var4.e.a();
                                if (jA != 0) {
                                    jMin = Math.min(jMin, jA);
                                }
                                c0VarJ.d();
                                int i10 = c0VarJ.f11054v;
                                boolK = gVar.k("google_analytics_adid_collection_enabled");
                                if (boolK != null) {
                                    z12 = z11;
                                } else {
                                    z12 = z11;
                                }
                                q0Var4.c();
                                long j17 = jMin;
                                boolean z14 = q0Var4.g().getBoolean("deferred_analytics_collection", z10);
                                c0VarJ.d();
                                String str6 = c0VarJ.f11056x;
                                boolK2 = gVar.k("google_analytics_default_allow_ad_personalization_signals");
                                if (boolK2 == null) {
                                    boolValueOf = null;
                                } else {
                                    boolValueOf = Boolean.valueOf(!boolK2.booleanValue());
                                }
                                long j18 = c0VarJ.f11051s;
                                List list = c0VarJ.f11052t;
                                String strE = q0Var4.h().e();
                                if (c0VarJ.f11053u == null) {
                                    a1.d(d3Var);
                                    byte[] bArr = new byte[16];
                                    d3Var.l().nextBytes(bArr);
                                    c0VarJ.f11053u = String.format(Locale.US, "%032x", new BigInteger(z11 ? 1 : 0, bArr));
                                }
                                String str7 = c0VarJ.f11053u;
                                zzqu.zzc();
                                if (gVar.l(null, z.f11463j0)) {
                                    c0VarJ.c();
                                    if (c0VarJ.f11058z != 0) {
                                        a1Var4.f11012y.getClass();
                                        long jCurrentTimeMillis = System.currentTimeMillis() - c0VarJ.f11058z;
                                        if (c0VarJ.f11057y != null) {
                                            c0VarJ.j();
                                        }
                                    }
                                    if (c0VarJ.f11057y == null) {
                                        c0VarJ.j();
                                    }
                                    str3 = c0VarJ.f11057y;
                                } else {
                                    str3 = null;
                                }
                                boolK3 = gVar.k("google_analytics_sgtm_upload_enabled");
                                if (boolK3 == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolK3.booleanValue();
                                }
                                zzpz.zzc();
                                if (gVar.l(null, z.f11486v0)) {
                                    a1.d(d3Var);
                                    a1Var = (a1) d3Var.f159a;
                                    strG = c0VarJ.g();
                                    if (a1Var.f11000a.getPackageManager() != null) {
                                        try {
                                            i = 0;
                                            try {
                                                applicationInfoD = p7.c.a(a1Var.f11000a).d(0, strG);
                                                if (applicationInfoD != null) {
                                                    i = applicationInfoD.targetSdkVersion;
                                                }
                                            } catch (PackageManager.NameNotFoundException unused5) {
                                                i0 i0Var7 = a1Var.f11007t;
                                                a1.f(i0Var7);
                                                i0Var7.f11196w.c(strG, "PackageManager failed to find running app: app_id");
                                            }
                                        } catch (PackageManager.NameNotFoundException unused6) {
                                            i = 0;
                                        }
                                        j10 = i;
                                    }
                                }
                                return new f3(str, strH, str4, j15, str5, 79000L, j11, strU, zB, z13, str2, j17, i10, z12, z14, str6, boolValueOf, j18, list, strE, str7, str3, zBooleanValue, j10);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        e = e10;
                        context = context2;
                    }
                } else {
                    context = context2;
                    str = strG2;
                }
                j4 = 0;
                c0VarJ.f11050r = j4;
            }
            j4 = jD0;
            c0VarJ.f11050r = j4;
        } else {
            context = context2;
            str = strG2;
            z10 = false;
            j4 = j16;
        }
        boolean zB2 = a1Var4.b();
        a1.d(q0Var4);
        j10 = 0;
        boolean z15 = !q0Var4.A;
        c0VarJ.c();
        if (a1Var4.b()) {
            j11 = j4;
            z11 = true;
            str2 = null;
        } else {
            zzrj.zzc();
            if (gVar.l(null, z.f11450b0)) {
                a1.f(i0Var2);
                i0Var2.f11198y.b("Disabled IID for tests.");
            } else {
                clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    z11 = true;
                    j11 = j4;
                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                    if (objInvoke == null) {
                        str2 = null;
                    } else {
                        str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    }
                }
                str2 = null;
            }
            j11 = j4;
            z11 = true;
            str2 = null;
        }
        jMin = a1Var4.R;
        jA = q0Var4.e.a();
        if (jA != 0) {
            jMin = Math.min(jMin, jA);
        }
        c0VarJ.d();
        int i11 = c0VarJ.f11054v;
        boolK = gVar.k("google_analytics_adid_collection_enabled");
        if (boolK != null || boolK.booleanValue()) {
            z12 = z11;
        } else {
            z12 = z10;
        }
        q0Var4.c();
        long j19 = jMin;
        boolean z16 = q0Var4.g().getBoolean("deferred_analytics_collection", z10);
        c0VarJ.d();
        String str8 = c0VarJ.f11056x;
        boolK2 = gVar.k("google_analytics_default_allow_ad_personalization_signals");
        if (boolK2 == null) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(!boolK2.booleanValue());
        }
        long j110 = c0VarJ.f11051s;
        List list2 = c0VarJ.f11052t;
        String strE2 = q0Var4.h().e();
        if (c0VarJ.f11053u == null) {
            a1.d(d3Var);
            byte[] bArr2 = new byte[16];
            d3Var.l().nextBytes(bArr2);
            c0VarJ.f11053u = String.format(Locale.US, "%032x", new BigInteger(z11 ? 1 : 0, bArr2));
        }
        String str9 = c0VarJ.f11053u;
        zzqu.zzc();
        if (gVar.l(null, z.f11463j0)) {
            c0VarJ.c();
            if (c0VarJ.f11058z != 0) {
                a1Var4.f11012y.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - c0VarJ.f11058z;
                if (c0VarJ.f11057y != null && jCurrentTimeMillis2 > 86400000 && c0VarJ.A == null) {
                    c0VarJ.j();
                }
            }
            if (c0VarJ.f11057y == null) {
                c0VarJ.j();
            }
            str3 = c0VarJ.f11057y;
        } else {
            str3 = null;
        }
        boolK3 = gVar.k("google_analytics_sgtm_upload_enabled");
        if (boolK3 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolK3.booleanValue();
        }
        zzpz.zzc();
        if (gVar.l(null, z.f11486v0)) {
            a1.d(d3Var);
            a1Var = (a1) d3Var.f159a;
            strG = c0VarJ.g();
            if (a1Var.f11000a.getPackageManager() != null) {
                i = 0;
                applicationInfoD = p7.c.a(a1Var.f11000a).d(0, strG);
                if (applicationInfoD != null) {
                    i = applicationInfoD.targetSdkVersion;
                }
                j10 = i;
            }
        }
        return new f3(str, strH, str4, j15, str5, 79000L, j11, strU, zB2, z15, str2, j19, i11, z12, z16, str8, boolValueOf, j110, list2, strE2, str9, str3, zBooleanValue, j10);
    }

    public final void n() {
        c();
        a1 a1Var = (a1) this.f159a;
        i0 i0Var = a1Var.f11007t;
        a1.f(i0Var);
        fd.b bVar = i0Var.f11198y;
        ArrayList arrayList = this.f11241s;
        bVar.c(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e) {
                i0 i0Var2 = a1Var.f11007t;
                a1.f(i0Var2);
                i0Var2.f11190f.c(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f11242t.a();
    }

    public final void o() {
        c();
        d6.e eVar = this.f11240r;
        ((n7.b) ((n7.a) eVar.f2936c)).getClass();
        eVar.f2935b = SystemClock.elapsedRealtime();
        ((a1) this.f159a).getClass();
        this.f11239f.c(((Long) z.J.a(null)).longValue());
    }

    public final void p(Runnable runnable) {
        a1 a1Var = (a1) this.f159a;
        c();
        if (j()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f11241s;
        long size = arrayList.size();
        a1Var.getClass();
        if (size >= 1000) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11190f.b("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f11242t.c(60000L);
            r();
        }
    }

    public final void r() {
        c();
        d();
        if (j()) {
            return;
        }
        if (l()) {
            j2 j2Var = this.f11237c;
            j2Var.f11219c.c();
            Context context = ((a1) j2Var.f11219c.f159a).f11000a;
            synchronized (j2Var) {
                try {
                    if (j2Var.f11217a) {
                        i0 i0Var = ((a1) j2Var.f11219c.f159a).f11007t;
                        a1.f(i0Var);
                        i0Var.f11198y.b("Connection attempt already in progress");
                        return;
                    } else {
                        if (j2Var.f11218b != null && (j2Var.f11218b.isConnecting() || j2Var.f11218b.isConnected())) {
                            i0 i0Var2 = ((a1) j2Var.f11219c.f159a).f11007t;
                            a1.f(i0Var2);
                            i0Var2.f11198y.b("Already awaiting connection attempt");
                            return;
                        }
                        j2Var.f11218b = new f0(context, Looper.getMainLooper(), j2Var, j2Var, 93);
                        i0 i0Var3 = ((a1) j2Var.f11219c.f159a).f11007t;
                        a1.f(i0Var3);
                        i0Var3.f11198y.b("Connecting to remote service");
                        j2Var.f11217a = true;
                        com.google.android.gms.common.internal.i0.i(j2Var.f11218b);
                        j2Var.f11218b.checkAvailabilityAndConnect();
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (((a1) this.f159a).f11005r.p()) {
            return;
        }
        ((a1) this.f159a).getClass();
        List<ResolveInfo> listQueryIntentServices = ((a1) this.f159a).f11000a.getPackageManager().queryIntentServices(new Intent().setClassName(((a1) this.f159a).f11000a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i0 i0Var4 = ((a1) this.f159a).f11007t;
            a1.f(i0Var4);
            i0Var4.f11190f.b("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(((a1) this.f159a).f11000a, "com.google.android.gms.measurement.AppMeasurementService"));
        j2 j2Var2 = this.f11237c;
        j2Var2.f11219c.c();
        Context context2 = ((a1) j2Var2.f11219c.f159a).f11000a;
        m7.a aVarB = m7.a.b();
        synchronized (j2Var2) {
            try {
                if (j2Var2.f11217a) {
                    i0 i0Var5 = ((a1) j2Var2.f11219c.f159a).f11007t;
                    a1.f(i0Var5);
                    i0Var5.f11198y.b("Connection attempt already in progress");
                } else {
                    i0 i0Var6 = ((a1) j2Var2.f11219c.f159a).f11007t;
                    a1.f(i0Var6);
                    i0Var6.f11198y.b("Using local app measurement service");
                    j2Var2.f11217a = true;
                    aVarB.a(context2, intent, j2Var2.f11219c.f11237c, 129);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s() {
        c();
        d();
        j2 j2Var = this.f11237c;
        if (j2Var.f11218b != null && (j2Var.f11218b.isConnected() || j2Var.f11218b.isConnecting())) {
            j2Var.f11218b.disconnect();
        }
        j2Var.f11218b = null;
        try {
            m7.a.b().c(((a1) this.f159a).f11000a, this.f11237c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f11238d = null;
    }

    public final void t(AtomicReference atomicReference) {
        c();
        d();
        p(new b3.b(this, atomicReference, m(false), 27));
    }
}
