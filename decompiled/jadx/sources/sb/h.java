package sb;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.ismaeldivita.chipnavigation.view.BadgeImageView;
import jd.l;
import q0.c1;
import ub.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f8478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f8479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f8480d;
    public final i e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GradientDrawable f8481f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final GradientDrawable f8482r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8483s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Typeface f8484t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8485u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f8486v;

    public h(Context context) {
        super(context, null);
        this.f8478b = new i(new f(this, 3));
        this.f8479c = new i(new f(this, 2));
        this.f8480d = new i(new f(this, 1));
        this.e = new i(new f(this, 0));
        this.f8481f = new GradientDrawable();
        this.f8482r = new GradientDrawable();
        this.f8483s = (int) getResources().getDimension(R.dimen.cnb_space_2);
        this.f8485u = -1;
        View.inflate(getContext(), R.layout.cnb_vertical_menu_item, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        Typeface typeface = getCountLabel().getTypeface();
        jc.i.d(typeface, "countLabel.typeface");
        this.f8484t = typeface;
    }

    private final View getContainer() {
        return (View) this.e.getValue();
    }

    private final TextView getCountLabel() {
        return (TextView) this.f8480d.getValue();
    }

    private final BadgeImageView getIcon() {
        return (BadgeImageView) this.f8479c.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.f8478b.getValue();
    }

    @Override // sb.e
    public final void a(qb.a aVar) {
        jc.i.e(aVar, "item");
        int i = aVar.h;
        CharSequence charSequence = aVar.f8046b;
        setId(aVar.f8045a);
        setEnabled(aVar.e);
        qb.b bVar = aVar.f8051j;
        float f10 = bVar.f8055d;
        int i10 = bVar.e;
        Integer num = bVar.f8054c;
        int i11 = bVar.f8053b;
        this.f8486v = f10;
        setImportantForAccessibility(1);
        CharSequence charSequence2 = aVar.f8047c;
        if (charSequence2 == null) {
            charSequence2 = charSequence;
        }
        setContentDescription(charSequence2);
        if (num != null) {
            TextView title = getTitle();
            jc.i.d(title, "title");
            title.setTextAppearance(num.intValue());
        }
        getTitle().setText(charSequence);
        TextView title2 = getTitle();
        jc.i.d(title2, "title");
        n9.b.B(title2, i, i11);
        if (num != null) {
            TextView countLabel = getCountLabel();
            jc.i.d(countLabel, "countLabel");
            countLabel.setTextAppearance(num.intValue());
        }
        TextView countLabel2 = getCountLabel();
        jc.i.d(countLabel2, "countLabel");
        n9.b.B(countLabel2, i, i11);
        getIcon().getLayoutParams().width = i10;
        getIcon().getLayoutParams().height = i10;
        getIcon().setBadgeColor(bVar.f8052a);
        getIcon().setImageResource(aVar.f8048d);
        BadgeImageView icon = getIcon();
        jc.i.d(icon, "icon");
        l.v(icon, aVar.f8050g, i11, aVar.f8049f);
        int i12 = aVar.i;
        GradientDrawable gradientDrawable = this.f8481f;
        gradientDrawable.setTint(i12);
        GradientDrawable gradientDrawable2 = this.f8482r;
        gradientDrawable2.setTint(-16777216);
        e();
        View container = getContainer();
        jc.i.d(container, "container");
        qd.b.B(container, gradientDrawable, gradientDrawable2);
    }

    @Override // sb.e
    public final void b(int i) {
        this.f8485u = i;
        if (i > 0) {
            getCountLabel().setTypeface(this.f8484t);
            getCountLabel().setText(String.valueOf(this.f8485u));
        } else {
            getCountLabel().setTypeface(Typeface.DEFAULT);
            getCountLabel().setText("⬤");
        }
        if (getTitle().getVisibility() == 0) {
            return;
        }
        getIcon().c(this.f8485u);
    }

    public final void c() {
        e();
        if (this.f8485u >= 0) {
            getIcon().c(this.f8485u);
        }
    }

    public final void d() {
        float[] fArr;
        int i = 2;
        if (getLayoutDirection() == 0) {
            float f10 = this.f8486v;
            fArr = new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f};
        } else {
            float f11 = this.f8486v;
            fArr = new float[]{f11, f11, 0.0f, 0.0f, 0.0f, 0.0f, f11, f11};
        }
        getTitle().setAlpha(0.0f);
        getTitle().setVisibility(0);
        getTitle().animate().alpha(1.0f).setStartDelay(200L).start();
        getCountLabel().setVisibility(0);
        View container = getContainer();
        jc.i.d(container, "container");
        ViewGroup.LayoutParams layoutParams = container.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type T of com.ismaeldivita.chipnavigation.util.ViewGroupKt.updateLayoutParams");
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(0);
        container.setLayoutParams(layoutParams);
        BadgeImageView icon = getIcon();
        jc.i.d(icon, "icon");
        p3.a.u(icon, new g(this, 1));
        this.f8482r.setCornerRadii(fArr);
        boolean zIsSelected = isSelected();
        GradientDrawable gradientDrawable = this.f8481f;
        if (zIsSelected) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f8486v, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new c1(gradientDrawable, this, i));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.start();
        } else {
            gradientDrawable.setCornerRadii(fArr);
        }
        if (this.f8485u >= 0) {
            BadgeImageView icon2 = getIcon();
            icon2.getOverlay().remove(icon2.f2746d);
            icon2.invalidate();
        }
    }

    public final void e() {
        getTitle().setVisibility(8);
        getCountLabel().setVisibility(8);
        this.f8482r.setCornerRadius(this.f8486v);
        View container = getContainer();
        jc.i.d(container, "container");
        p3.a.u(container, new g(this, 0));
        BadgeImageView icon = getIcon();
        jc.i.d(icon, "icon");
        ViewGroup.LayoutParams layoutParams = icon.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type T of com.ismaeldivita.chipnavigation.util.ViewGroupKt.updateLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.setMarginEnd(0);
        icon.setLayoutParams(layoutParams);
        boolean zIsSelected = isSelected();
        GradientDrawable gradientDrawable = this.f8481f;
        if (!zIsSelected) {
            gradientDrawable.setCornerRadius(this.f8486v);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.f8486v);
        valueAnimatorOfFloat.addUpdateListener(new c1(gradientDrawable, this, 2));
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.start();
    }

    @Override // sb.e, android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        if (z4 || !isSelected()) {
            return;
        }
        setSelected(false);
    }
}
