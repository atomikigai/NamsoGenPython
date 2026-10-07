package e6;

import com.google.android.gms.internal.ads.zzbhx;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzbxo;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f3427f = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i6.d f3428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f3429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i6.a f3431d;
    public final Random e;

    public s() {
        i6.d dVar = new i6.d();
        dVar.f5224a = -1.0f;
        n3 n3Var = new n3("com.google.android.gms.ads.AdManagerCreatorImpl");
        y2 y2Var = new y2("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 1);
        y2 y2Var2 = new y2("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl", 0);
        zzbhx zzbhxVar = new zzbhx();
        new zzbxo();
        zzbtd zzbtdVar = new zzbtd();
        new zzbhy();
        q qVar = new q(n3Var, y2Var, y2Var2, zzbhxVar, zzbtdVar, new y2("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl", 2));
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        i6.a aVar = new i6.a(0, 243799000, true);
        Random random = new Random();
        this.f3428a = dVar;
        this.f3429b = qVar;
        this.f3430c = string;
        this.f3431d = aVar;
        this.e = random;
    }
}
