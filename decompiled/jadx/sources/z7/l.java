package z7;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11244d;
    public AccountManager e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f11245f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f11246r;

    @Override // z7.f1
    public final boolean d() {
        Calendar calendar = Calendar.getInstance();
        this.f11243c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f11244d = da.v.u(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long g() {
        c();
        return this.f11246r;
    }

    public final long h() {
        e();
        return this.f11243c;
    }

    public final String j() {
        e();
        return this.f11244d;
    }

    public final boolean k() {
        c();
        a1 a1Var = (a1) this.f159a;
        n7.b bVar = a1Var.f11012y;
        i0 i0Var = a1Var.f11007t;
        Context context = a1Var.f11000a;
        bVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f11246r > 86400000) {
            this.f11245f = null;
        }
        Boolean bool = this.f11245f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (e0.k.checkSelfPermission(context, "android.permission.GET_ACCOUNTS") != 0) {
            a1.f(i0Var);
            i0Var.f11194u.b("Permission error checking for dasher/unicorn accounts");
            this.f11246r = jCurrentTimeMillis;
            this.f11245f = Boolean.FALSE;
            return false;
        }
        if (this.e == null) {
            this.e = AccountManager.get(context);
        }
        try {
            Account[] result = this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            if (result != null && result.length > 0) {
                this.f11245f = Boolean.TRUE;
                this.f11246r = jCurrentTimeMillis;
                return true;
            }
            Account[] result2 = this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.f11245f = Boolean.TRUE;
                this.f11246r = jCurrentTimeMillis;
                return true;
            }
            this.f11246r = jCurrentTimeMillis;
            this.f11245f = Boolean.FALSE;
            return false;
        } catch (AuthenticatorException e) {
            e = e;
            a1.f(i0Var);
            i0Var.f11191r.c(e, "Exception checking account types");
        } catch (OperationCanceledException e4) {
            e = e4;
            a1.f(i0Var);
            i0Var.f11191r.c(e, "Exception checking account types");
        } catch (IOException e10) {
            e = e10;
            a1.f(i0Var);
            i0Var.f11191r.c(e, "Exception checking account types");
        }
    }
}
