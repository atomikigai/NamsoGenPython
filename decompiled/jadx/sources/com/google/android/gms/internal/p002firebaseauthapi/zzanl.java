package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
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
public final class zzanl {
    public static final zzanl zza;
    public static final zzanl zzb;
    public static final zzanl zzc;
    public static final zzanl zzd;
    public static final zzanl zze;
    public static final zzanl zzf;
    public static final zzanl zzg;
    public static final zzanl zzh;
    public static final zzanl zzi;
    public static final zzanl zzj;
    public static final zzanl zzk;
    public static final zzanl zzl;
    public static final zzanl zzm;
    public static final zzanl zzn;
    public static final zzanl zzo;
    public static final zzanl zzp;
    public static final zzanl zzq;
    public static final zzanl zzr;
    private static final /* synthetic */ zzanl[] zzs;
    private final zzanm zzt;

    static {
        zzanl zzanlVar = new zzanl("DOUBLE", 0, zzanm.DOUBLE, 1);
        zza = zzanlVar;
        zzanl zzanlVar2 = new zzanl("FLOAT", 1, zzanm.FLOAT, 5);
        zzb = zzanlVar2;
        zzanm zzanmVar = zzanm.LONG;
        zzanl zzanlVar3 = new zzanl("INT64", 2, zzanmVar, 0);
        zzc = zzanlVar3;
        zzanl zzanlVar4 = new zzanl("UINT64", 3, zzanmVar, 0);
        zzd = zzanlVar4;
        zzanm zzanmVar2 = zzanm.INT;
        zzanl zzanlVar5 = new zzanl("INT32", 4, zzanmVar2, 0);
        zze = zzanlVar5;
        zzanl zzanlVar6 = new zzanl("FIXED64", 5, zzanmVar, 1);
        zzf = zzanlVar6;
        zzanl zzanlVar7 = new zzanl("FIXED32", 6, zzanmVar2, 5);
        zzg = zzanlVar7;
        zzanl zzanlVar8 = new zzanl("BOOL", 7, zzanm.BOOLEAN, 0);
        zzh = zzanlVar8;
        zzanl zzanlVar9 = new zzanl("STRING", 8, zzanm.STRING, 2);
        zzi = zzanlVar9;
        zzanm zzanmVar3 = zzanm.MESSAGE;
        zzanl zzanlVar10 = new zzanl("GROUP", 9, zzanmVar3, 3);
        zzj = zzanlVar10;
        zzanl zzanlVar11 = new zzanl("MESSAGE", 10, zzanmVar3, 2);
        zzk = zzanlVar11;
        zzanl zzanlVar12 = new zzanl("BYTES", 11, zzanm.BYTE_STRING, 2);
        zzl = zzanlVar12;
        zzanl zzanlVar13 = new zzanl("UINT32", 12, zzanmVar2, 0);
        zzm = zzanlVar13;
        zzanl zzanlVar14 = new zzanl("ENUM", 13, zzanm.ENUM, 0);
        zzn = zzanlVar14;
        zzanl zzanlVar15 = new zzanl("SFIXED32", 14, zzanmVar2, 5);
        zzo = zzanlVar15;
        zzanl zzanlVar16 = new zzanl("SFIXED64", 15, zzanmVar, 1);
        zzp = zzanlVar16;
        zzanl zzanlVar17 = new zzanl("SINT32", 16, zzanmVar2, 0);
        zzq = zzanlVar17;
        zzanl zzanlVar18 = new zzanl("SINT64", 17, zzanmVar, 0);
        zzr = zzanlVar18;
        zzs = new zzanl[]{zzanlVar, zzanlVar2, zzanlVar3, zzanlVar4, zzanlVar5, zzanlVar6, zzanlVar7, zzanlVar8, zzanlVar9, zzanlVar10, zzanlVar11, zzanlVar12, zzanlVar13, zzanlVar14, zzanlVar15, zzanlVar16, zzanlVar17, zzanlVar18};
    }

    private zzanl(String str, int i, zzanm zzanmVar, int i10) {
        super(str, i);
        this.zzt = zzanmVar;
    }

    public static zzanl[] values() {
        return (zzanl[]) zzs.clone();
    }

    public final zzanm zza() {
        return this.zzt;
    }
}
