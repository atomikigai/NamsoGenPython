package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzakt {
    public static final zzakt zza;
    public static final zzakt zzb;
    public static final zzakt zzc;
    public static final zzakt zzd;
    public static final zzakt zze;
    public static final zzakt zzf;
    public static final zzakt zzg;
    public static final zzakt zzh;
    public static final zzakt zzi;
    public static final zzakt zzj;
    private static final /* synthetic */ zzakt[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzakt zzaktVar = new zzakt("VOID", 0, Void.class, Void.class, null);
        zza = zzaktVar;
        Class cls = Integer.TYPE;
        zzakt zzaktVar2 = new zzakt("INT", 1, cls, Integer.class, 0);
        zzb = zzaktVar2;
        zzakt zzaktVar3 = new zzakt("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzaktVar3;
        zzakt zzaktVar4 = new zzakt("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzaktVar4;
        zzakt zzaktVar5 = new zzakt("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzaktVar5;
        zzakt zzaktVar6 = new zzakt("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzaktVar6;
        zzakt zzaktVar7 = new zzakt("STRING", 6, String.class, String.class, "");
        zzg = zzaktVar7;
        zzakt zzaktVar8 = new zzakt("BYTE_STRING", 7, zzajf.class, zzajf.class, zzajf.zzb);
        zzh = zzaktVar8;
        zzakt zzaktVar9 = new zzakt("ENUM", 8, cls, Integer.class, null);
        zzi = zzaktVar9;
        zzakt zzaktVar10 = new zzakt("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzaktVar10;
        zzk = new zzakt[]{zzaktVar, zzaktVar2, zzaktVar3, zzaktVar4, zzaktVar5, zzaktVar6, zzaktVar7, zzaktVar8, zzaktVar9, zzaktVar10};
    }

    private zzakt(String str, int i, Class cls, Class cls2, Object obj) {
        super(str, i);
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzakt[] values() {
        return (zzakt[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
