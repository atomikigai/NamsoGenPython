package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f5583f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f5585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f5586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f5587d;
    public Resources e;

    public d(Context context, int i) {
        super(context);
        this.f5584a = i;
    }

    public final void a(Configuration configuration) {
        if (this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f5587d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f5587d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f5585b == null) {
            this.f5585b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f5585b.setTo(theme);
            }
        }
        this.f5585b.applyStyle(this.f5584a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.e == null) {
            Configuration configuration = this.f5587d;
            if (configuration == null) {
                this.e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f5583f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f5583f = configuration2;
                    }
                    if (configuration.equals(f5583f)) {
                        this.e = super.getResources();
                    }
                }
                this.e = c.a(this, this.f5587d).getResources();
            }
        }
        return this.e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f5586c == null) {
            this.f5586c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f5586c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f5585b;
        if (theme != null) {
            return theme;
        }
        if (this.f5584a == 0) {
            this.f5584a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f5585b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f5584a != i) {
            this.f5584a = i;
            b();
        }
    }
}
