package com.tomato.framework.log.support;

/**
 * @author frd
 */
public class OrderBy {

    private static final Direction DEFAULT_DIRECTION = Direction.DESC;

    private String field;

    private Direction direction = DEFAULT_DIRECTION;

    private OrderBy(String field) {
        this.field = field;
    }

    private OrderBy(String field, Direction direction) {
        this.field = field;
        this.direction = direction;
    }

    public static OrderBy where(String field) {
        return new OrderBy(field);
    }

    public String getField() {
        return field;
    }

    public Direction getDirection() {
        return direction;
    }

    public OrderBy asc() {
        this.direction = Direction.ASC;
        return this;
    }

    public OrderBy desc() {
        this.direction = Direction.DESC;
        return this;
    }

    public enum Direction {
        ASC, DESC;

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static void main(String[] args) {
        OrderBy orderBy = OrderBy.where("innId");
        System.out.println(orderBy.getDirection().toString());
    }
}
